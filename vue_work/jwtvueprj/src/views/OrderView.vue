<template>
    <h1>주문</h1>
    <p>{{jwtStore.mainData}}</p>
    <button @click="orderGo">주문확인</button>
</template>
<script setup>
import { useJwtStore } from '@/stores/jwtStore';

const jwtStore = useJwtStore()


async function orderGo(){
    await jwtStore.orderGo()
}

</script>