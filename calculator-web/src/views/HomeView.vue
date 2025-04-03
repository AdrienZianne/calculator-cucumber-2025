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
    min-width: 100vw;
}

@media(min-width: 0px) and (max-width: 1366px)
{
  .home{
    flex-direction: column;
    min-width: 180vw;
    height: 50vh;
  }
  h1{
    min-width: 180vw;
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
}

h1 {
  font-size: 30px;
  color: #333;
  position: absolute; 
  top: 0; 
  text-align: center;
  background-color: #deebee;
  width: 100%;
}
</style>