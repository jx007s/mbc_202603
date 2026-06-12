<template>
    <h1>로그인</h1>
    아이디 : <input v-model="uid">
    <button @click="loginGo">로그인</button>
</template>
<script setup>
import { useJwtStore } from '@/stores/jwtStore';
import { ref } from 'vue';

const jwtStore = useJwtStore()
const uid = ref('')

async function loginGo(){
    await jwtStore.loginGo(uid.value)
}

</script>