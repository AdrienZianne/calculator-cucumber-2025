<template>
  <div class="home">
    <h1>Calculator-cucumber</h1>
    <Calculator class="calculator"/>
    <Info/>
  </div>
</template>

<script>
import Calculator from '@/components/Calculator.vue';
import Info from '@/components/Info.vue';

export default {
  components: {Calculator, Info}
};
</script>

<style scoped>
@import '@/assets/sharedviews.css';
</style>