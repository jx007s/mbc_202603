<template>
    <h1>로그인</h1>
    아이디 : <input v-model="uid">
    <button @click="loginGo">로그인</button>
</template>
<script setup>
import { useJwtStore } from '@/stores/jwtStore';
import { ref } from 'vue';
import { useRouter} from 'vue-router';

const jwtStore = useJwtStore()
const uid = ref('')
const router = useRouter()


async function loginGo(){
    await jwtStore.loginGo(uid.value)
    router.push('/')   //로그인 후 메인페이지로 이동
}

</script>