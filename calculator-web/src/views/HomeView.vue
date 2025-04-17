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

.home {
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    min-width: 100vw;
    height: 100vh;
}

/* @media(min-width: 0px) and (max-width: 1366px)
{
  .home{
    flex-direction: column;
    height: 50vh;
  }
  h1{
  }
  .calculator{
    margin-top: 100px;
  }
}

@media(min-width: 0px) and (max-width: 1366px) and (orientation: landscape) 
{
  .calculator{
    margin-top: 200px;
  }
} */

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