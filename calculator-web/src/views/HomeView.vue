<template>
  <div class="home">
    <h1>Calculator-cucumber</h1>
    <Calculator class="calculator"/>
    <Info/>
  </div>
</template>

<script>
import Calculator from '@/components/icons/Calculator.vue';
import Info from '@/components/icons/Info.vue';

export default {
  components: {Calculator, Info}
};
</script>


<style scoped>

.home {
    display: flex;
    justify-content: center;
    align-items: center;
}

@media(min-width: 900px) and (max-width: 2000px)
{
  .home {
    /*Just to move the navigation bar further.*/
    min-width: 100vw; 
  }
  h1 {
    min-width: 100vw;
  }
}

@media(min-width: 0px) and (max-width: 899px)
{
  .home {
    display: inline-block;
    padding: 25px;
    left: 0;
  }
  h1 {
    display: inline-block;
  }
}

h1 {
  font-size: 30px;
  color: #333;
  position: absolute; 
  top: 0; 
  text-align: center;
  background-color: #deebee;
}

.calculator {
  margin-top: 100px;
  margin-bottom: 100px;
}

</style>
