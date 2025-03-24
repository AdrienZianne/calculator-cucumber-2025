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

    <textarea v-model="inputText" id="inputId" @keydown="forbiddenKeys" placeholder="You can write here..."></textarea>
    
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
        <button @click="removeOneKey">⌫</button>
        <button @click="clearAll">AC</button>
        <button @click="moveCursorLeft">←</button>
        <button @click="moveCursorRight">→</button>
        <button @click="replyRequest">=</button>
      </div>
    </div>

    <!--This button allows to display the third part of the keyboard.-->
    <button @click="expandKeyboard" v-if="!isExpandKeyboard">Expand Keyboard</button>
    <button @click="expandKeyboard" v-if="isExpandKeyboard">Reduce Keyboard</button>
  </div>
</template>

<script>
import Alert from '@/components/icons/Alert.vue';

export default {
  components: {Alert},
  data() {
    return {
      inputText: '',
      isExpandKeyboard : false,
      isMemory : false,
      authorizedKeys : [..."0123456789.()/*+-^".split(''), "Shift", "Backspace",
      "ArrowLeft", "ArrowRight", "ArrowDown", "ArrowUp"],
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
        ..."xeπ".split('')
      ],
    };
  },
  methods: {
    /**
     * Method for adding a key in the textarea.
     * @param key What we want to write.
     */
    addKey(key) {
      this.inputText += key;
    },
    /**
     * Method for deleting the last key entered in the textarea.
     */
    removeOneKey() {
      this.inputText = this.inputText.slice(0, -1);
    },
    /**
     * Method used to remove a specific character from the textarea.
     * The case where enter is pressed is also managed.
     * 
     * @param character the character to delete.
     */
    removeSpecificWord(character){
      if (character = 'Enter' ) this.removeOneKey();
      else this.inputText = this.inputText.replace(character, '');
    },
    /**Method for deleting the entire entry in the textaera.*/
    clearAll() {
      this.inputText = '';
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
      if (!this.authorizedKeys.includes(word)) setTimeout(() => this.removeSpecificWord(word), 5); 
        
      if (word == "Enter" || word == "=") this.replyRequest();
      
    },
    /**Method for moving the cursor left.*/
    moveCursorLeft(){ 
      //https://www.geeksforgeeks.org/how-to-place-cursor-position-at-end-of-text-in-text-input-field-using-javascript/
      this.cursorPosition = inputId.selectionStart;
      inputId.focus();
      if(this.cursorPosition != 0) inputId.setSelectionRange(this.cursorPosition-1, this.cursorPosition-1);
    },
    /**Method for moving the cursor right.*/
    moveCursorRight(){
      this.cursorPosition = inputId.selectionStart;
      inputId.focus();
      inputId.setSelectionRange(this.cursorPosition+1, this.cursorPosition+1);
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
      this.memoryList.splice(i, 1);
      if(this.memoryList.length == 0) this.isMemory = false;
    },
    /**
     * Method for handling API requests.
     */
    replyRequest(){

      //just for testing
      
      this.isMemory = true;
      this.memoryList.push(this.inputText);
      this.inputText = "2";
      if(this.memoryList.length > 5) this.memoryRemove(0);

      /*try {
        throw new Error("test");
      } catch (error) {
        console.log("hi")
        setTimeout(() => Alert.errorManagement(error.message), 1)
      }*/
      
      //Send the calculation to do.
      if(this.inputText != "")
      {
        const requestOptions = {
          method: "POST",
          headers: {}, 
          body: JSON.stringify({ calculation: this.inputText }) //In GET, we can't put a body.
        };
        fetch("https://aaa.net/api/aaa", requestOptions)
          .then(response => {
              if(!response.ok) return response.json().then(json => Promise.reject(json));       
              else return response.json();
          })
          .then(data => {
            this.isMemory = true;
            this.memoryList.push(this.inputText);
            if(this.memoryList.length > 5) this.memoryRemove(0);
            this.inputText = data.result;
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
  gap: 10px;
}

.keyboard {
  display: grid;
  grid-template-columns: repeat(4, 1fr); /*https://developer.mozilla.org/en-US/docs/Web/CSS/repeat*/
  grid-gap: 5px;
  padding: 6px;
}

.keyboard-expand {
  display: grid;
  grid-template-columns: repeat(4, 1fr); 
  grid-gap: 5px;
  padding: 6px;
  grid-auto-rows: 50px; 
}

button {
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
</style>
