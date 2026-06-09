<template>
    <div>
        <h2>pinia 손자</h2>
        <p>손자 count : {{store.count}}</p> <!-- getter : {{store.count}} -->
        <button @click="store.countAdd">증가</button>
        <button @click="store.countSub">감소</button>
    </div>
</template>
<script setup>
import { inject } from 'vue';

// PinPar 가 제공한 store 사용
const store = inject('myStore')
</script>