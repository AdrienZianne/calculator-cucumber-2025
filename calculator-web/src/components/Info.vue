<template>
    <button @click="accessFile">ℹ️</button>
</template>
  
<script>
import Alert from '@/components/Alert.vue';
export default {
  components: {Alert},
  props:{
      type : Number
  },
  methods: {
    /**
     * Method that creates a pop-up explaining the application.
     * 
     * @param data The text to display.
     */
    display(data) {
        Alert.infoManagement(data);
    },
    /** Method that loads text from the file. */
    accessFile() {
      if(this.type == 0) {
        fetch('/public/infopro.txt') 
          .then(response => response.text()) 
          .then(data => {
            this.display(data);
          })
          .catch(error => {
            Alert.errorManagement(error);
          });
      }
      else if (this.type == 1) {
        fetch('/public/info.txt') 
          .then(response => response.text()) 
          .then(data => {
            this.display(data);
          })
          .catch(error => {
            Alert.errorManagement(error);
          });
      } else {
        fetch('/public/infosetting.txt') 
          .then(response => response.text()) 
          .then(data => {
            this.display(data);
          })
          .catch(error => {
            Alert.errorManagement(error);
          });
      }
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
}

@media(min-width: 1367px) and (max-width: 2000px)
{
  button {
    /*https://stackoverflow.com/questions/8449933/how-to-transition-css-display-opacity-properties*/
    opacity: 0;
    transition: opacity 0.5s ease-in-out;
  }
  button:hover {
    opacity: 1;
    background-color: #73a6f3;
  }
}
</style>