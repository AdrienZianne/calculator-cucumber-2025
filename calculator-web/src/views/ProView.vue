<template>
    <div class="home">
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
  @import '@/assets/sharedviews.css';
  </style>