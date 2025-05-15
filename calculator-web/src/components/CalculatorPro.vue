<template>
  <!-- add minimum margin -->
  <div class="container">
    <!--First div that covers everything.-->
    <div class="calculator-container">

      <div class="history-window" v-if="isHistoryOpen">
        <div class="history-container">
          <div v-for="(memory, i) in memoryList" :memory="memory" :i="i" class="command">
            <button class="memory-button" :class="{ 'memory-button-expand': isExpandKeyboard }"
              @click="memoryBack(memory); isHistoryOpen = false">
              {{ memory }}
            </button>
            <button class="delete-button" @click="memoryRemove(i)"></button>
          </div>
        </div>
        <div class="separator"></div>
        <div class="button-container">
          <button class="memory-clear-button" @click="memoryClear()">Clear Memory</button>
          <button class="close-history-button" @click="isHistoryOpen = false">Close history</button>
        </div>
      </div>

      <!--Divs managing the memoryList.-->
      <!-- <div class="calculator-memory" v-if="isMemory">
        <div v-for="(memory, i) in memoryList" :memory="memory" :i="i">
          <button class="memory-button" @click="memoryBack(memory)">
            {{ memory }}
          </button>
          <button class="delete-button" @click="memoryRemove(i)"></button>
        </div>
        <button class="memory-clear-button" @click="memoryClear()">Clear Memory</button>
      </div> -->
      <button class="show-history-button" @click="isHistoryOpen = true">See history</button>

      <div>
        <!--https://github.com/justforuse/vue-mathjax-->
        <!--https://github.com/justforuse/vue-mathjax-next-->
        <textarea v-model="inputText" @paste.prevent id="inputId" @keydown="forbiddenKeys"
          placeholder="You can write here..."></textarea>
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
        <button @click="gapButton" class="key gapButton">__________</button>
      </div>
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
        ..."0123456789.abcdefghijklmnopqrstuvxy()_<>, ".split('')
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
        ">",
        ","
      ],
      isHistoryOpen: false
    };
  },
  mounted() {
    if (localStorage.getItem("programmer_memory")) {
      this.memoryList = JSON.parse(localStorage.getItem("programmer_memory"));
      this.isMemory = true;
    }
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
      if (!this.authorizedKeys.includes(word.lowercase())) setTimeout(() => this.removeSpecificWord(word));
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
      localStorage.removeItem("programmer_memory");
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
            localStorage.setItem("programmer_memory", JSON.stringify(this.memoryList));
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


.calculator-container {
    position: relative;
}

.calculator-keyboard {
  display: grid;
  grid-template-columns: 1fr;
  grid-template-rows: 1fr 4fr 4fr 1fr;
  gap: 10px 5px;
}

.history-window {
    position: absolute;
    display: flex;
    flex-direction: column;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    background-color: #499956bb;
    border-radius: 10px;
    height: 70vh;
    width: min(80vw, 800px);
    backdrop-filter: blur(4px);
    padding: 20px;
    gap: 15px;
}

.history-container {
    display: flex;
    flex-direction: column-reverse;
    gap: 10px;
    flex-grow: 1;
    overflow: scroll;
}

.memory-button {
    flex-grow: 1;
}

.command {
    display: flex;
    flex-direction: row;
    justify-content: center;
    align-items: baseline;
    gap: 5px;
}

.button-container {
    display: flex;
    flex-direction: column;
    gap: 5px;
}

.keyboard {
  display: grid;
  grid-template-columns: repeat(6, 1fr);
  /*https://developer.mozilla.org/en-US/docs/Web/CSS/repeat*/
  gap: 5px;
}

.number {
  grid-template-columns: repeat(10, 1fr);
  grid-template-rows: 40px;
}

@media only screen and (max-width: 650px) {

  .calculator-keyboard {
    grid-template-rows: 2fr 4fr 4fr 1fr;
  }

  .keyboard {
    grid-template-columns: repeat(6, 1fr);
  }

  .number {
    grid-template-columns: repeat(5, 1fr);
    grid-template-rows: repeat(2, 30px);
  }

  .key {
    font-size: 14px;
  }
}
</style>