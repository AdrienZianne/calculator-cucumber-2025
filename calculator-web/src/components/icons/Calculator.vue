<template>
  <div class="calculator-container">
    <textarea v-model="inputText" id="inputId" @keydown="forbiddenKeys" placeholder="You can write here..."></textarea>
    
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
    addKey(key) {
      this.inputText += key;
    },
    removeOneKey() {
      this.inputText = this.inputText.slice(0, -1);
    },
    clearAll() {
      this.inputText = '';
    },
    expandKeyboard() {
      this.isExpandKeyboard = !this.isExpandKeyboard;
    },
    forbiddenKeys(event) {
      if (!this.authorizedKeys.includes(event.key)) {
        //without a timer, remove is not applied correctly.
        setTimeout(() => this.removeOneKey(), 1); //https://stackoverflow.com/questions/42511311/vuejs-on-input-run-a-function-but-with-a-delay
        if (event.key == "Enter") this.replyRequest;
      }
    },
    moveCursorLeft(){ //https://www.geeksforgeeks.org/how-to-place-cursor-position-at-end-of-text-in-text-input-field-using-javascript/
      this.cursorPosition = inputId.selectionStart;
      inputId.focus();
      if(this.cursorPosition != 0) inputId.setSelectionRange(this.cursorPosition-1, this.cursorPosition-1);
    },
    moveCursorRight(){
      this.cursorPosition = inputId.selectionStart;
      inputId.focus();
      inputId.setSelectionRange(this.cursorPosition+1, this.cursorPosition+1);
    },
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
