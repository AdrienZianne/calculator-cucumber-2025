<template>
  <!-- add minimum margin -->
  <div class="container">
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
        <textarea v-model="inputText" @paste.prevent id="inputId" @keydown="forbiddenKeys"
          placeholder="You can write here..."></textarea>
        <vue-mathjax :formula="`$$` + inputText + `$$`"></vue-mathjax>
      </div>

      <!--Three divs representing the three parts of the keyboard. 
      The calculator-keyboard div allows you to place the keyboard parts side by side.-->
      <div class="calculator-keyboard">
        <div class="keyboard number">
          <button class="key ink1" v-for="number in numbers" :number="number" @click="addKey(number)">
            {{ number }}
          </button>
        </div>

        <div class="keyboard letter">
          <button class="key" v-for="letter in letters" :letter="letter" @click="addKey(letter)">
            {{ letter }}
          </button>
        </div>

        <div class="keyboard operator">
          <button class="key" v-for="op in operations" :op="op" @click="addKey(op)">
            {{ op }}
          </button>
          <button class="key" @click="removeASpecificKey">⌫</button>
          <button class="key" @click="clearAll">AC</button>
          <button class="key" @click="moveCursorLeft">←</button>
          <button class="key" @click="moveCursorRight">→</button>
          <button class="key" @click="replyRequest">=</button>
        </div>
      </div>

      <button @click="gapButton" class="key gapButton">__________</button>
    </div>
  </div>
</template>

<script>
import Alert from '@/components/Alert.vue';
import VueMathjax from 'vue-mathjax-next';
import GlobalMethods from './GlobalMethods.vue';

export default {
  components: { Alert, VueMathjax, GlobalMethods },
  data() {
    return {
      inputText: '',
      isMemory: false,
      inputId: document.getElementById('inputId'),
      memoryList: [],
      authorizedKeys: [
        ..."0123456789.abcdefghijklmnopqrstuvxy()_<>".split('')
      ],
      numbers: [
        ..."0123456789".split('')
      ],
      letters: [
        ..."abcdefghijklmnopqrstuvxy".split('')
      ],
      operations: [
        "randi",
        "randre",
        "randra",
        "randc",
        "not",
        "nand",
        "nor",
        "and",
        "xor",
        "or",
        "impl",
        "equiv",
        "conv",
        ..."_()".split(''),
        "<",
        ">"
      ]
    };
  },
  methods: {
    /**
     * Method for adding a key in the textarea.
     * 
     * @param key What we want to write.
     * @see GlobalMethods.vue
     */
    addKey(key) {
      this.inputText = GlobalMethods.addKey(key, this.inputText, inputId);
    },
    /**
     * Method for deleting a character at the current index.
     * 
     * @see GlobalMethods.vue
     */
    removeASpecificKey() {
      this.inputText = GlobalMethods.removeASpecificKey(this.inputText, inputId);
    },
    /**
     * Method used to remove a specific character from the textarea.
     * 
     * @param character the character to delete.
     * @see GlobalMethods.vue
     */
    removeSpecificWord(character) {
      let res = GlobalMethods.removeSpecificWord(character, this.inputText, inputId);
      this.inputText = res.inputText;
    },
    /**Method for deleting the entire entry in the textaera.*/
    clearAll() {
      this.inputText = '';
    },
    /**Method used to add a space in the textaera.*/
    gapButton() {
      this.addKey(" ");
    },
    /**
    * Method for filtering keyboard entries.
    * 
    * @param event Event linked to the key pressed on the keyboard.
    */
    forbiddenKeys(event) {
      //without a timer, remove is not applied correctly.
      //https://stackoverflow.com/questions/42511311/vuejs-on-input-run-a-function-but-with-a-delay
      let word = event.key;
      if (this.inputText.includes('^')) this.inputText = this.inputText.replaceAll("^", "");
      if (this.inputText.includes('¨')) this.inputText = this.inputText.replaceAll("¨", "");
      if (this.inputText.includes('`')) this.inputText = this.inputText.replaceAll("`", "");
      if (!this.authorizedKeys.includes(word)) setTimeout(() => this.removeSpecificWord(word));
      if (word == "Enter" || word == "=") this.replyRequest();
    },
    /**Method for moving the cursor left.
     * 
     * @see GlobalMethods.vue
    */
    moveCursorLeft() {
      GlobalMethods.moveCursorLeft(inputId);
    },
    /**Method for moving the cursor right.
     * 
     * @see GlobalMethods.vue
    */
    moveCursorRight() {
      GlobalMethods.moveCursorRight(inputId);
    },
    /**
     * Method for returning to a specific input.
     * 
     * @param memory The input we want to reuse.
     */
    memoryBack(memory) {
      this.inputText = memory;
    },
    /** Method for deleting memory. */
    memoryClear() {
      this.isMemory = false;
      this.memoryList = [];
    },
    /**
     * Method that removes an element from the list at a particular index.
     * 
     * @param i The index.
     * @see GlobalMethods.vue
     */
    memoryRemove(i) {
      let res = GlobalMethods.memoryRemove(i, this.memoryList);
      this.isMemory = res.isMemory;
      this.memoryList = res.memoryList;
    },
    /**
     * Method for handling API requests.
     * 
     * @see GlobalMethods.vue
     */
    replyRequest() {
      if (this.inputText != "") {
        if (this.inputText.includes('randi')) this.inputText = this.inputText.replaceAll("randi", "rand_int");
        if (this.inputText.includes('randre')) this.inputText = this.inputText.replaceAll("randre", "rand_real");
        if (this.inputText.includes('randra')) this.inputText = this.inputText.replaceAll("randra", "rand_ratio");
        if (this.inputText.includes('randc')) this.inputText = this.inputText.replaceAll("randc", "rand_cmplx");
        const requestOptions = {
          method: "POST",
          headers: {
            "Content-Type": "application/json",
            "Accept": "application/json",
          },
          body: JSON.stringify({ input: this.inputText, isProgra: true }) //In GET, we can't put a body.
        };
        fetch("http://localhost:8080/calc", requestOptions)
          .then(response => {
            if (!response.ok) return response.json().then(json => Promise.reject(json));
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
@import '@/assets/sharedcalculator.css';


.calculator-keyboard {
  display: grid;
  grid-template-columns: 1fr;
  gap: 10px 5px;
}

.expanded {
  grid-template-columns: repeat(3, 1fr);
}

.keyboard {
  display: grid;
  grid-template-columns: repeat(6, 1fr);
  /*https://developer.mozilla.org/en-US/docs/Web/CSS/repeat*/
  gap: 5px;
}

.number {
  grid-template-columns: repeat(10, 1fr);
}

@media only screen and (max-width: 650px) {

  .calculator-keyboard {
    grid-template-columns: repeat(1, 1fr);
  }

  .keyboard {
    grid-template-columns: repeat(6, 1fr);
  }
  
  .number {
    grid-template-columns: repeat(5, 1fr);
  }

  .key {
    font-size: 14px;
  }
}
</style>