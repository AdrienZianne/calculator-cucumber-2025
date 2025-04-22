<template>
    <div class="home">
      <h1>Calculator-cucumber-programmer</h1>
      <Calculator class="calculator"/>
      <Info isCalculatorPro/>
    </div>
  </template>
  
  <script>
  import Calculator from '@/components/CalculatorPro.vue';
  import Info from '@/components/Info.vue';
  
  export default {
    components: {Calculator, Info}
  };
  </script>
  
  <style scoped>
  
  .home {
      display: flex;
      justify-content: center;
      align-items: center;
      flex-direction: column;
      min-width: 100vw;
      height: 100vh;
  }

  h1 {
    font-size: 30px;
    color: #333;
    text-align: center;
    background-color: #deebee;
    width: 100%;
  }
  
  .calculator {
    margin: auto;
  }
  </style>