<template>
  <!--First div that covers everything.-->
  <div class="calculator-container">
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
        <button @click="moveCursorLeft"><</button>
        <button @click="moveCursorRight">></button>
        <button @click="replyRequest">=</button>
      </div>

    </div>
    <!--This button allows to display the third part of the keyboard.-->
    <button @click="expandKeyboard" v-if="!isExpandKeyboard">Expand Keyboard</button>
    <button @click="expandKeyboard" v-if="isExpandKeyboard">Reduce Keyboard</button>
  </div>
</template>

<script>
export default {
  data() {
    return {
      inputText: '',
      isExpandKeyboard : false,
      authorizedKeys : [..."0123456789i.()/*+-^".split(''), "Shift", "Backspace"],
      inputId : document.getElementById('inputId'),
      numbers: [
        ..."0123456789i.".split('')
      ],
      operations: [
        ..."()/*+-^".split(''),
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
     * Method for adding a key to the keyboard.
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
      if (!this.authorizedKeys.includes(event.key)) {
        //without a timer, remove is not applied correctly.
        //https://stackoverflow.com/questions/42511311/vuejs-on-input-run-a-function-but-with-a-delay
        setTimeout(() => this.removeOneKey(), 1); 
        if (event.key == "Enter") this.replyRequest;
      }
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
     * Method for handling API requests.
     */
    replyRequest(){

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
</style>
