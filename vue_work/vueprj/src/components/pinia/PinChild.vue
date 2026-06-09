<template>
    <div>
        <h2>pinia 자식</h2>
        <p>자식 count : {{store.count}}</p> <!-- getter : {{store.count}} -->
        <PinGrandChild/>
    </div>
</template>
<script setup>
import PinGrandChild from './PinGrandChild.vue';
import { useCounterStore } from './stores/mycc.js';

const store = useCounterStore() 

</script>