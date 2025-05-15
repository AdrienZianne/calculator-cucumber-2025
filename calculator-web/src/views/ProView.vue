<template>
    <div class="home">
      <Header></Header>
      <Calculator class="calculator"/>
      <Info type="0"/>
    </div>
  </template>
  
  <script>
  import Calculator from '@/components/CalculatorPro.vue';
  import Info from '@/components/Info.vue';
  import Header from '@/components/Header.vue';
  
  export default {
    components: {Calculator, Info, Header}
  };
  </script>
  
  <style scoped>
  @import '@/assets/sharedviews.css';
  </style>