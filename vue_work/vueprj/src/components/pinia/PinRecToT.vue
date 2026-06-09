<template>
    <div>
        <h2>PinRecToT</h2>
        <PinRecAdd/>
        <table border="">
            <tr>
                <td>가로</td>
                <td>세로</td>
                <td>넓이</td>
                <td>둘레</td>
            </tr>
            <PinRec v-for="rr in store.arr" :key="rr.rid" :data="rr" />

            <tr>
                <td></td>
                <td></td>
                <td>{{store.totalArea}}</td>
                <td>{{store.avgBorder}}</td>
            </tr>
        </table>
    </div>
</template>
<script setup>

import PinRec from './PinRec.vue';
import { useRecStore } from './stores/myRec.js';
import PinRecAdd from './PinRecAdd.vue';
const store = useRecStore()



</script>