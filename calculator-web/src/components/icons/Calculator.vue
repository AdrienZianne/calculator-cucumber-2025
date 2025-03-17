<template>
  <div class="calculator-container">
    <textarea v-model="inputText" placeholder="You can write here..."></textarea>
    
    <div class="calculator-keyboard">
      <button v-for="key in keys" :key="key" @click="addKey(key)">
        {{ key }}
      </button>

      <button @click="removeOneKey">⌫</button>
      <button @click="clearAll">AC</button>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      inputText: '',
      keys: [
        ..."0123456789".split(''),
        ..."i.".split(''),
        ..."()/*+-^".split(''),
        //"log"
      ]
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
  height: 100px !important; 
  margin-bottom: 15px;
  font-size: 15px;
  border-radius: 5px;
  border: 1px solid #ddd;
}

.calculator-keyboard {
  display: grid;
  grid-template-columns: repeat(10, 1fr); /*https://developer.mozilla.org/en-US/docs/Web/CSS/repeat*/
  grid-gap: 5px;
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
