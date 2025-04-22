<template>
    <!--First div that covers everything.-->
    <div class="calculator-container">
  
      <!--Divs managing the memoryList.-->
      <div class="calculator-memory" v-if="isMemory">
        <div v-for="(memory, i) in memoryList" :memory="memory" :i="i">
          <button class="memory-button" @click="memoryBack(memory)">
            {{ memory }}
          </button>
          <button class="delete-button" @click="memoryRemove(i)"></button>
        </div>
        <button class="memory-clear-button" @click="memoryClear()">Clear Memory</button>
      </div>
  
      <div>
      <!--https://github.com/justforuse/vue-mathjax-->
      <!--https://github.com/justforuse/vue-mathjax-next-->
      <textarea v-model="inputText" @paste.prevent id="inputId" @keydown="forbiddenKeys" placeholder="You can write here..."></textarea>
        <vue-mathjax :formula="`$$`+inputText+`$$`"></vue-mathjax>
      </div>
  
      <!--Three divs representing the three parts of the keyboard. 
      The calculator-keyboard div allows you to place the keyboard parts side by side.-->
      <div class="calculator-keyboard" >
        <div class="keyboard1">
          <button class="ink1" v-for="number in numbers" :number="number" @click="addKey(number)">
            {{ number }}
          </button>
        </div>

        <div class="keyboard2">
          <button v-for="letter in letters" :letter="letter" @click="addKey(letter)">
            {{ letter }}
          </button>
        </div>
  
        <div class="keyboard3">
          <button v-for="op in operations" :op="op" @click="addKey(op)">
            {{ op }}
          </button>
          <button @click="moveCursorLeft">←</button>
          <button @click="moveCursorRight">→</button>
          <button @click="clearAll">AC</button>
          <button @click="removeASpecificKey">⌫</button>
          <button @click="replyRequest">=</button>
        </div>
      </div>
  
      <button @click="gapButton" class="gapButton">__________</button>
    </div>
  </template>
  
  <script>
  import Alert from '@/components/Alert.vue';
  import VueMathjax from 'vue-mathjax-next';
  import GlobalMethods from './GlobalMethods.vue';
  
  export default {
    components: {Alert, VueMathjax, GlobalMethods},
    data() {
      return {
        inputText: '',
        isMemory : false,
        inputId : document.getElementById('inputId'),
        memoryList : [],
        authorizedKeys : [
          ..."0123456789.abcdefghijklmnopqrstuvwx()_".split('')
        ],
        numbers: [
          ..."0123456789.".split('')
        ],
        letters : [
          ..."abcdefghijklmnopqrstuvwx".split('')
        ],
        operations: [
          ...",_()".split(''),
          "randi",
          "randre",
          "randra",
          "randc",
          "not",
          "nand",
          "nor",
          "and",
          "&",
          "or",
          "impl",
          "equiv",
          "<",
          ">",
          "ls",
          "rs",
          "conv"
        ]
      };
    },
    methods: {
      /**
       * Method for adding a key in the textarea.
       * @param key What we want to write.
       */
      addKey(key) {
        this.inputText = GlobalMethods.addKey(key, this.inputText, inputId);
      },
      /**
       * Method for deleting the last key entered in the textarea.
       */
       removeOneKey() {
        this.inputText = this.inputText.slice(0, -1);
      },
      /**
       * Method for deleting a character at the current index.
       */
      removeASpecificKey() {
        this.inputText = GlobalMethods.removeASpecificKey(this.inputText, inputId);
      },
      /**
       * Method used to remove a specific character from the textarea.
       * The case where enter is pressed is also managed.
       * 
       * @param character the character to delete.
       */
       removeSpecificWord(character){
        if (character == 'Enter') this.removeOneKey();
        else if (character != 'Dead'){
          //management of ^ or ¨ or ` spam.
          inputId.blur();
          this.inputText = this.inputText.replaceAll(character, '');  
          inputId.focus();
        }
      },
      /**Method for deleting the entire entry in the textaera.*/
      clearAll() {
        this.inputText = '';
      },
      /**Method used to add a space in the textaera.*/
      gapButton(){
        this.addKey(" ");
      },
      /**
     * Method for filtering keyboard entries.
     * @param event Event linked to the key pressed on the keyboard.
     */
    forbiddenKeys(event) {
        //without a timer, remove is not applied correctly.
        //https://stackoverflow.com/questions/42511311/vuejs-on-input-run-a-function-but-with-a-delay
        let word = event.key;
        this.inputText= this.inputText.replaceAll("^","");
        this.inputText= this.inputText.replaceAll("¨","");
        this.inputText= this.inputText.replaceAll("`","");
        if (!this.authorizedKeys.includes(word)) setTimeout(() => this.removeSpecificWord(word), 5);        
        if (word == "Enter" || word == "=") this.replyRequest();   
      },
      /**Method for moving the cursor left.*/
      moveCursorLeft(){ 
        GlobalMethods.moveCursorLeft(inputId);
      },
      /**Method for moving the cursor right.*/
      moveCursorRight(){
        GlobalMethods.moveCursorRight(inputId);
      },
      /**
       * Method for returning to a specific input.
       * @param memory The input we want to reuse.
       */
      memoryBack(memory)
      {
        this.inputText = memory;
      },
      /**
       * Method for deleting memory.
       */
      memoryClear(){
        this.isMemory = false;
        this.memoryList = [];
      },
      /**
       * Method that removes an element from the list at a particular index.
       * @param i The index.
       */
      memoryRemove(i){
        let res = GlobalMethods.memoryRemove(i, this.memoryList);
        this.isMemory = res.isMemory;
        this.memoryList = res.memoryList;
      },
      /**
       * Method for handling API requests.
       */
      replyRequest(){
        if(this.inputText != "")
        {
          this.inputText = this.inputText.replaceAll("randi","rand_int");
          this.inputText = this.inputText.replaceAll("randre","rand_real");
          this.inputText = this.inputText.replaceAll("randra","rand_ratio");
          this.inputText = this.inputText.replaceAll("randc","rand_cmplx");
          const requestOptions = {
            method: "POST",
            headers: {
              "Content-Type": "application/json",
              "Accept": "application/json",
            },
            body: JSON.stringify({ input: this.inputText, isProgra : true }) //In GET, we can't put a body.
          };
          fetch("http://localhost:8080/calc", requestOptions)
            .then(response => {
                if(!response.ok) return response.json().then(json => Promise.reject(json));       
                else return response.json();
            })
            .then(data => {
              let res = GlobalMethods.memoryUpdate(this.memoryList, this.inputText);
              this.isMemory = res.isMemory;
              this.memoryList = res.memoryList;
              this.inputText = data.answer;
            })
            .catch(error => {
              this.inputText = "";
              Alert.errorManagement(error.message);
            });
        }
      }
    }
  };
  </script>
  
  <style scoped>
  .calculator-container {
    display: flex;
    flex-direction: column;  
    padding: 20px;
    border-radius: 10px;  
    box-shadow: 4px 8px 19px 1px rgba(0,0,0,0.5);
    gap: 10px;
  }
  
  textarea {
    resize: none;
    width: 100% !important;
    height: 50px !important; 
    margin-bottom: 15px;
    font-size: 18px;
    border-radius: 5px;
    border: 1px solid #ddd;
  }
  
  .calculator-memory{
    display: grid;
  }
  
  .calculator-keyboard {
    display: flex;
    flex-wrap: wrap;
    flex-flow: wrap;
    width: 100%;
  }
  
  .keyboard1 {
    display: grid;
    grid-template-columns: repeat(4, 1fr); /*https://developer.mozilla.org/en-US/docs/Web/CSS/repeat*/
    grid-gap: 5px;
    padding: 6px;
  }

  .ink1{
    min-width: 50px;  
  }

  .keyboard2 {
    display: grid;
    grid-template-columns: repeat(6, 1fr);
    grid-gap: 5px;
    padding: 6px;
  }

  .keyboard3 {
    display: grid;
    grid-template-columns: repeat(4, 1fr); 
    grid-gap: 5px;
    padding: 6px;
  }
  
  button {
    width: auto;
    padding: 10px;
    font-size: 20px;
    cursor: pointer;
    background-color: #deebee;
    border: none;
    border-radius: 5px;
  }
  
  button:hover {
    background-color: #c1d6f6;
  }
  
  .memory-button{
    background-color: #f5f6f5;
    min-width: 360px; 
    max-width: 360px; 
    overflow-wrap: break-word;
    margin-bottom: 10px;
  }
  
  .memory-button:hover {
    background-color: #ceefce;
  }

  .memory-clear-button {
    margin-bottom: 10px;
  }
  
  .memory-clear-button:hover {
    background-color: #940909;
  }
  
  .delete-button {
    background: none;
    font-size: 20px; 
    cursor: pointer; 
  }
  
  .delete-button::after{
    content: '✖️';
  }
  
  .delete-button:hover{
    background: none;
  }
  
  .delete-button:hover::after {
    content: '❌';
  }
  
  .gapButton{
    margin-bottom: 5px;
  }
  </style>