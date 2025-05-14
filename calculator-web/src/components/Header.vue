<template>
    <div class="header">
        <RouterLink to="/" class="home-button">
            <img src="../assets/logo.svg" alt="Logo" />
            <div>Calculator-cucumber</div>
        </RouterLink>

        <div class="dropdown" @click="clicked" v-bind:class="isClicked?'clicked':''">
            <img src="../assets/menu.svg" class="menu"/>
            <div class="links">
                <HeaderLink to="/" text="Basic" class="content" />
                <HeaderLink to="/pro" text="Programmer" class="content" />
                <HeaderLink to="/settings" text="Settings" class="content" />
            </div>
        </div>
    </div>
</template>

<script setup>
import HeaderLink from './HeaderLink.vue';
import { RouterLink } from 'vue-router';
import { ref } from 'vue'

const isClicked = ref(false);

function clicked() {
   if (window.matchMedia("(pointer: coarse)").matches) {
    isClicked = !isClicked;
   }
}

</script>

<style>
img {
    height: 32px;
}

.menu {
    visibility: hidden;
    display: none;
}

.dropdown {
    display: flex;
    flex-direction: column;
    flex-grow: 1;
}

.home-button {
    display: flex;
    flex-direction: row;
    grid-column: 1;
    align-items: center;
    margin: auto;
    gap: 20px;
    font-size: 35px;
}

.links {
    display: flex;
    flex-direction: row;
    font-size: 20px;
    align-items: center;
    justify-content: left;
    flex-grow: 1;
}

.header {
    display: flex;
    flex-direction: row;
    grid-template-columns: repeat(2, 1fr);
    align-items: stretch;
    gap: 30px;
    color: #333;
    text-align: center;
    background-color: #deebee;
    width: 100%;
    padding-left: 20px;
}

@media only screen and (max-width: 800px) {

    .home-button {
        display: flex;
        flex-direction: row;
        grid-column: 2;
        align-items: center;
        justify-content: center;
        gap: 20px;
        font-size: 20px;
    }

    .links {
        display: none;
        position: absolute;
        top: 100%;
        font-size: 12px;
        background-color: #deebee;
        text-transform: uppercase;
    }

    .link {
        padding: 10px 10px;
        font-weight: bolder;
    }

    .header {
        display: grid;
        grid-template-columns: 1fr 4fr 1fr;
        align-items: center;
        gap: 30px;
        color: #333;
        text-align: center;
        width: 100%;
        padding-left: 0;
    }

    .dropdown {
        grid-column: 1;
        grid-row: 1;
        height: 100%;
        display: block;
        position: relative;
        align-content: center;
        align-items: center;
        justify-content: center;
        z-index: 1;
    }

    .menu {
        visibility: visible;
        display: block;
        margin: auto;
    }

    .clicked .links, .dropdown:hover .links {
        display: block;
    }
}
</style>