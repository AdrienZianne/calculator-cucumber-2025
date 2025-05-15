<template>
    <div class="home">
        <Header></Header>
        <Settings class="calculator" />
        <Info />
    </div>
</template>

<script>
import Info from '@/components/Info.vue';
import Settings from '@/components/Settings.vue';
import Header from '@/components/Header.vue';

export default {
    components: { Settings, Info, Header }
};
</script>

<style scoped>
@import '@/assets/sharedviews.css';
</style>