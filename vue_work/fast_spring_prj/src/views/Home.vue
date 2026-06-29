<template>
    <h1>홈입니다</h1>
    <div>검색결과 : {{store.car}}</div>
</template>

<script setup>
import { useCarNumStore } from '@/stores/CarNumStore';
import { onMounted } from 'vue';
import { useRoute } from 'vue-router';

const store = useCarNumStore()
const route = useRoute()

onMounted(async ()=>{
    
})


</script>