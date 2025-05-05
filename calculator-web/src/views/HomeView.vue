<template>
  <div class="home">
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