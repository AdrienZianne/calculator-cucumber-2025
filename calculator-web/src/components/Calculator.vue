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
                    <button class="memory-button" :class="{ 'memory-button-expand': isExpandKeyboard }"
                        @click="memoryBack(memory)">
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
                <textarea v-model="inputText" @paste.prevent id="inputId" @keydown="forbiddenKeys" @input="formatInput"
                    placeholder="You can write here..."></textarea>
                <div v-katex="`$$` + formattedInputText + `$$`" v-bind:style="isHistoryOpen ? 'visibility: hidden' : ''"></div>
            </div>

            <!--Three divs representing the three parts of the keyboard. 
      The calculator-keyboard div allows you to place the keyboard parts side by side.-->
            <div class="calculator-keyboard" v-bind:class="isExpandKeyboard?'expanded':''">
                <div class="keyboard number">
                    <button class="key" v-for="number in numbers" :number="number" @click="addKey(number)">
                        {{ number }}
                    </button>
                </div>

                <div class="keyboard symbol">
                    <button class="key" v-for="op in operations" :op="op" @click="addKey(op)">
                        {{ op }}
                    </button>
                    <button class="key" @click="moveCursorLeft">←</button>
                    <button class="key" @click="moveCursorRight">→</button>
                    <button class="key" @click="removeASpecificKey">⌫</button>
                    <button class="key" @click="clearAll">AC</button>
                    <button class="key pc2" @click="replyRequest">=</button>
                </div>

                <div class="keyboard trigo" v-if="isExpandKeyboard">
                    <button class="key" v-for="expand in expandOperations" :expand="expand" @click="addKey(expand)">
                        {{ expand }}
                    </button>
                </div>
            </div>

            <button @click="gapButton" class="gapButton">__________</button>
            <!--This button allows to display the third part of the keyboard.-->
            <button @click="expandKeyboard" v-if="!isExpandKeyboard">Expand Keyboard</button>
            <button @click="expandKeyboard" v-if="isExpandKeyboard">Reduce Keyboard</button>
        </div>
    </div>
</template>

<script>
import Alert from '@/components/Alert.vue';
import VueMathjax from 'vue-mathjax-next';
import GlobalMethods from './GlobalMethods.vue';

export default {
    components: { Alert, VueMathjax, GlobalMethods},
    data() {
        return {
            inputText: '',
            formattedInputText: '',
            isExpandKeyboard: false,
            isMemory: false,
            authorizedKeys: [..."0123456789.()/*+-logsqrtcinaPI,x=".split(''), "Shift", "Backspace",
                "ArrowLeft", "ArrowRight", "ArrowDown", "ArrowUp", " ", ","],
            inputId: document.getElementById('inputId'),
            memoryList: [],
            numbers: [
                ..."0123456789i.".split('')
            ],
            operations: [
                ..."+-/*()^%|x".split(''),
            ],
            expandOperations: [
                "log",
                "cos",
                "sin",
                "tan",
                "sqrt",
                "root",
                "PI",
                ","
            ],
            isHistoryOpen: false
        };
    },
    mounted() {
        if (localStorage.getItem("arithmetic_memory")) {
        this.memoryList = JSON.parse(localStorage.getItem("arithmetic_memory"));
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
            this.formatInput();
        },
        /**
         * Method for deleting a character at the current index.
         * 
         * @see GlobalMethods.vue
         */
        removeASpecificKey() {
            this.inputText = GlobalMethods.removeASpecificKey(this.inputText, inputId);
            this.formatInput();
        },
        /**
         * Method used to remove a specific character from the textarea.
         * 
         * @param character the character to delete.
         * @see GlobalMethods.vue
         */
        removeSpecificWord(character) {
            let res = GlobalMethods.removeSpecificWord(character, this.inputText, inputId, this.formattedInputText);
            this.inputText = res.inputText;
            this.formattedInputText = res.formattedInputText;
        },
        /**Method for deleting the entire entry in the textaera.*/
        clearAll() {
            this.inputText = '';
            this.formatInput();
        },
        /**Method used to add a space in the textaera.*/
        gapButton() {
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
            let number = ["^1", "^2", "^3", "^4", "^5", "^6", "^7", "^8", "^9", "^10"];
            if (!this.authorizedKeys.includes(word) && !number.includes(word)) setTimeout(() => this.removeSpecificWord(word));
            if (word == "Enter") this.replyRequest();
        },
        /**
         * Method for formatting the input into a beautiful font.
         */
        formatInput() {
            this.formattedInputText = this.inputText;
            if (this.formattedInputText.includes('*')) this.formattedInputText = this.formattedInputText.replaceAll('*', '\\times');
            //(?<!(cos|sin|tan|log)) is a negative lookbehind assertion. 
            //(?<!y)x on https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_expressions/Cheatsheet
            //[^xyz] negated character class.
            //First replacement for () which covers almost all cases.
            if (this.formattedInputText.includes('(')) this.formattedInputText = this.formattedInputText.replaceAll(/(?<!(cos|sin|tan|log))\(/g, '{');
            if (this.formattedInputText.includes(')')) this.formattedInputText = this.formattedInputText.replaceAll(/(?<!(cos|sin|tan|log)[^\)]*)\)/g, '}');
            //If there is no sqrt or ^ before {} then transform them into ().
            while (this.formattedInputText.match(/(?<!sqrt|\^)\{([^\}\{]*)\}/g)) {
                this.formattedInputText = this.formattedInputText.replaceAll(/(?<!sqrt|\^)\{([^\}\{]*)\}/g, '($1)');
            }
            while (this.formattedInputText.match(/\(((?:.*))\)\/\(((?:[^\)]*))\)/g)) {
                this.formattedInputText = this.formattedInputText.replaceAll(/\(((?:.*))\)\/\(((?:[^\)]*))\)/g, '\\frac{$1}{$2}');
            }
            if (this.formattedInputText.includes('sqrt')) this.formattedInputText = this.formattedInputText.replaceAll('sqrt', '\\sqrt');
            if (this.formattedInputText.includes('PI')) this.formattedInputText = this.formattedInputText.replaceAll('PI', '\\pi');
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
            this.formatInput();
        },
        /** Method for deleting memory. */
        memoryClear() {
            this.isMemory = false;
            this.memoryList = [];
            localStorage.removeItem("arithmetic_memory");
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
                const requestOptions = {
                    method: "POST",
                    headers: {
                        "Content-Type": "application/json",
                        "Accept": "application/json",
                    },
                    body: JSON.stringify({ input: this.inputText, isProgra: false }) //In GET, we can't put a body.
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
                        localStorage.setItem("arithmetic_memory", JSON.stringify(this.memoryList));
                        this.inputText = data.answer;
                        this.formatInput();
                    })
                    .catch(error => {
                        this.inputText = "";
                        Alert.errorManagement(error.message);
                        this.formatInput();
                    });
            }
        },
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
    grid-template-columns: repeat(2, 1fr);
    gap: 10px;
}

.expanded {
    grid-template-columns: repeat(2, 1fr);
}

.keyboard {
    display: grid;
    grid-template-columns: repeat(4, 50px); /*https://developer.mozilla.org/en-US/docs/Web/CSS/repeat*/
    gap: 5px;
}

.trigo {
    grid-column: span 2;
    grid-template-columns: repeat(8, 50px);
    grid-template-rows: 40px;
    justify-self: center;
}

.symbol {
    grid-template-rows: repeat(4, 40px);
}

.pc2 {
    grid-column: span 2;
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

.separator {
    background-color: rgb(255, 255, 255);
    border-radius: 5px;
    height: 5px;
}

@media only screen and (max-width: 650px) {

    .calculator-keyboard {
        grid-template-columns: 3fr 4fr;
    }

    .keyboard {
        grid-template-columns: repeat(3, 40px);
        grid-template-rows: repeat(4, 40px);
    }

    .key {
        font-size: 14px;
    }

    .trigo {
        grid-template-columns: repeat(4, 1fr);
        grid-template-rows: repeat(2, 30px);
        grid-column: 1 / span 2;
        width: 100%;
    }

    .symbol {
        grid-template-rows: repeat(4, 40px);
        grid-template-columns: repeat(4, 40px);
    }
}

</style>