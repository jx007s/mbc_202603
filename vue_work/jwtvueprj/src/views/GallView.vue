<template>
    <h1>갤러리</h1>
    <p>{{jwtStore.mainData}}</p>
</template>
<script setup>
import { useJwtStore } from '@/stores/jwtStore';
import { onMounted } from 'vue';

const jwtStore = useJwtStore()

onMounted(async()=>{
    await jwtStore.gall()
})

</script>