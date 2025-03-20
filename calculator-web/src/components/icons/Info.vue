<template>
    <button @click="accessFile">ℹ️</button>
</template>
  
  <script>
  import Alert from '@/components/icons/Alert.vue';
  
export default {
  components: {Alert},
  methods: {
    /**
     * Method that creates a pop-up explaining the application.
     * @param data The text to display.
     */
    display(data) {
        Alert.infoManagement(data);
    },
    /**
     * Method that loads text from the file.
     */
    accessFile() {
      fetch('/public/info.txt') 
        .then(response => response.text()) 
        .then(data => {
          this.display(data);
        })
        .catch(error => {
          Alert.errorManagement(error);
        });
    }
  }
};
</script>
  
<style scoped>
button {
  background: none;
  font-size: 30px; 
  cursor: pointer; 
  border: none;
  /*https://stackoverflow.com/questions/8449933/how-to-transition-css-display-opacity-properties*/
  opacity: 0;
  transition: opacity 0.5s ease-in-out;
}

button:hover {
  opacity: 1;
  background-color: #73a6f3;
}

</style>
  