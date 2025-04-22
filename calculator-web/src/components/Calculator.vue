<template>
  <!--First div that covers everything.-->
  <div class="calculator-container">

    <!--Divs managing the memoryList.-->
    <div class="calculator-memory" v-if="isMemory">
      <div v-for="(memory, i) in memoryList" :memory="memory" :i="i">
        <button class="memory-button" :class="{'memory-button-expand' : isExpandKeyboard}" @click="memoryBack(memory)">
          {{ memory }}
        </button>
        <button class="delete-button" @click="memoryRemove(i)"></button>
      </div>
      <button class="memory-clear-button" @click="memoryClear()">Clear Memory</button>
    </div>

    <div>
    <!--https://github.com/justforuse/vue-mathjax-->
    <!--https://github.com/justforuse/vue-mathjax-next-->
    <textarea v-model="inputText" @paste.prevent id="inputId" @keydown="forbiddenKeys" @input="formatInput" placeholder="You can write here..."></textarea>
      <vue-mathjax :formula="`$$`+formattedInputText+`$$`"></vue-mathjax>
    </div>

    <!--Three divs representing the three parts of the keyboard. 
    The calculator-keyboard div allows you to place the keyboard parts side by side.-->
    <div class="calculator-keyboard" >
      <div class="keyboard">
        <button v-for="number in numbers" :number="number" @click="addKey(number)">
          {{ number }}
        </button>
      </div>

      <div class="keyboard-expand" v-if="isExpandKeyboard">
        <button v-for="expand in expandOperations" :expand="expand" @click="addKey(expand)">
          {{ expand }}
        </button>
      </div>

      <div class="keyboard">
        <button v-for="op in operations" :op="op" @click="addKey(op)">
          {{ op }}
        </button>
        <button @click="removeASpecificKey">⌫</button>
        <button @click="clearAll">AC</button>
        <button @click="moveCursorLeft">←</button>
        <button @click="moveCursorRight">→</button>
        <button @click="replyRequest">=</button>
      </div>
    </div>

    <button @click="gapButton" class="gapButton">__________</button>
    <!--This button allows to display the third part of the keyboard.-->
    <button @click="expandKeyboard" v-if="!isExpandKeyboard">Expand Keyboard</button>
    <button @click="expandKeyboard" v-if="isExpandKeyboard">Reduce Keyboard</button>
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
      formattedInputText: '',
      isExpandKeyboard : false,
      isMemory : false,
      authorizedKeys : [..."0123456789.()/*+-".split(''), "Shift", "Backspace",
      "ArrowLeft", "ArrowRight", "ArrowDown", "ArrowUp", " ", ","],
      inputId : document.getElementById('inputId'),
      memoryList : [],
      numbers: [
        ..."0123456789i.".split('')
      ],
      operations: [
        ..."+-/*()^".split(''),
      ],
      expandOperations:[
        "log",
        "cos",
        "sin",
        "tan",
        "sqrt",
        "PI",
        ","
      ],
    };
  },
  methods: {
    /**
     * Method for adding a key in the textarea.
     * @param key What we want to write.
     */
    addKey(key) {
      this.inputText = GlobalMethods.addKey(key, this.inputText, inputId);
      this.formatInput();
    },
    /**
     * Method for deleting the last key entered in the textarea.
     */
     removeOneKey() {
      this.inputText = this.inputText.slice(0, -1);
      this.formatInput();
    },
    /**
     * Method for deleting a character at the current index.
     */
    removeASpecificKey() {
      this.inputText = GlobalMethods.removeASpecificKey(this.inputText, inputId);
      this.formatInput();
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
        this.formattedInputText = this.formattedInputText.replaceAll(character, '');
      }
    },
    /**Method for deleting the entire entry in the textaera.*/
    clearAll() {
      this.inputText = '';
      this.formatInput();
    },
    /**Method used to add a space in the textaera.*/
    gapButton(){
      this.addKey(" ");
    },
    /**
     * Method for adding extra keys to the keyboard.
     */
    expandKeyboard() {
      this.isExpandKeyboard = !this.isExpandKeyboard;
    },
    /**
     * Method for filtering keyboard entries.
     * @param event Event linked to the key pressed on the keyboard.
     */
    forbiddenKeys(event) {
      //without a timer, remove is not applied correctly.
      //https://stackoverflow.com/questions/42511311/vuejs-on-input-run-a-function-but-with-a-delay
      let word = event.key;
      //There is always ^number not only ^.
      let number = ["^1", "^2", "^3", "^4", "^5", "^6", "^7", "^8", "^9","^10"];
      if (!this.authorizedKeys.includes(word) && !number.includes(word)) setTimeout(() => this.removeSpecificWord(word), 5);        
      if (word == "Enter" || word == "=") this.replyRequest();   
    },
    /**
     * Method for formatting the input into a beautiful font.
     */
    formatInput() {
      this.formattedInputText = this.inputText;
      if(this.formattedInputText.includes('*')) this.formattedInputText = this.formattedInputText.replaceAll('*','\\times');
      //(?<!(cos|sin|tan|log)) is a negative lookbehind assertion. 
      //(?<!y)x on https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_expressions/Cheatsheet
      //[^xyz] negated character class.
      //First replacement for () which covers almost all cases.
      if(this.formattedInputText.includes('(')) this.formattedInputText = this.formattedInputText.replaceAll(/(?<!(cos|sin|tan|log))\(/g, '{');
      if(this.formattedInputText.includes(')')) this.formattedInputText = this.formattedInputText.replaceAll(/(?<!(cos|sin|tan|log)[^\)]*)\)/g, '}');
      //If there is no sqrt or ^ before {} then transform them into ().
      if(this.formattedInputText.includes('{') || this.formattedInputText.includes('}')) this.formattedInputText = this.formattedInputText.replaceAll(/(?<!sqrt|\^)\{(.*)\}/g, '($1)');
      if(this.formattedInputText.includes('/')) this.formattedInputText = this.formattedInputText.replaceAll(/\((.*)\/(.*)\)/g, '\\frac{$1}{$2}');

      if(this.formattedInputText.includes('sqrt')) this.formattedInputText = this.formattedInputText.replaceAll('sqrt','\\sqrt');
      if(this.formattedInputText.includes('PI')) this.formattedInputText = this.formattedInputText.replaceAll('PI','\\pi');
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
      this.formatInput();
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
        const requestOptions = {
          method: "POST",
          headers: {
            "Content-Type": "application/json",
            "Accept": "application/json",
          },
          body: JSON.stringify({ input: this.inputText }) //In GET, we can't put a body.
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
            this.formatInput();
          })
          .catch(error => {
            this.inputText = "";
            Alert.errorManagement(error.message);
            this.formatInput();
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

.keyboard {
  display: grid;
  grid-template-columns: repeat(4, 1fr); /*https://developer.mozilla.org/en-US/docs/Web/CSS/repeat*/
  grid-gap: 5px;
  padding: 6px;
}

@media only screen and (max-width: 650px) {

  .keyboard, .keyboard-expand {
    width: 100%;
  }
}

.keyboard-expand {
  display: grid;
  grid-template-columns: repeat(3, 1fr); 
  grid-gap: 5px;
  padding: 6px;
  grid-auto-rows: 50px; 
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

.memory-button-expand{
  min-width: 550px; 
  max-width: 550px;
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