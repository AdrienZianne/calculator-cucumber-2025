<template>
  <div class="home">
    <h1>Calculator-cucumber</h1>
    <Calculator class="calculator"/>
  </div>
</template>

<script>
import Calculator from '@/components/icons/Calculator.vue';

export default {
  components: {Calculator}
};
</script>

<style scoped>
.home {
  display: flex;
  justify-content: center;
  align-items: center;
  
  /*We want to take the entire width/height of the window.*/
  min-height: 100vh; 
  width: 100vw; 
  background-color: #fff; 
}

h1 {
  font-size: 30px;
  color: #333;
  position: absolute; 
  top: 0; 
  text-align: center;
  width: 100%;
  background-color: #deebee;
}

.calculator {
  margin-top: 100px;
  margin-bottom: 100px;
}
</style>
