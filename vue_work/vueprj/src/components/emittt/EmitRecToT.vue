<template>
    <div>
        <h2>EmitRecToT</h2>
        <EmitRecAdd @addRow="addRow"/>
        <table border="">
            <tr>
                <td>가로</td>
                <td>세로</td>
                <td>넓이</td>
                <td>둘레</td>
            </tr>
            <EmitRec v-for="rr in arr"  :data="rr" />
            
        </table>
    </div>
</template>
<script setup>
import { reactive } from 'vue';
import EmitRec from './EmitRec.vue';
import EmitRecAdd from './EmitRecAdd.vue';

const arr = reactive([
    {ww:4, hh:5},
    {ww:10, hh:10},
    {ww:7, hh:8},
    {ww:6, hh:10}
])

function addRow(newData){
    arr.push(newData)
}

</script>