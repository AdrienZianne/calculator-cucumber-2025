<template>
    <RouterLink :to="props.to" class="link">
        <div>
            {{ props.text }}
        </div>
    </RouterLink>
</template>

<script setup>
import { RouterLink, useRouter } from 'vue-router';
const router = useRouter();
const props = defineProps({
    to: {
        type: String,
        required: true
    },
    text: {
        type: String,
        required: true
    },
});
</script>

<style>

.link {
    display: flex;
    height: 100%;
    justify-content: center;
    align-items: center;
    padding: 0 20px;
}

</style>