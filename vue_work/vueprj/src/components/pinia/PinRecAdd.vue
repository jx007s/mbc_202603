<template>
<div>
    가로<input v-model.number="ww"/>
    세로<input v-model.number="hh"/>
    <button @click="add">추가</button>
</div>
</template>
<script setup>
import { ref } from 'vue';
import { useRecStore } from './stores/myRec.js';

const store = useRecStore()


    const ww = ref(0)
    const hh = ref(0)

    function add(){
        store.addRow({
            ww:ww.value,
            hh:hh.value
        })
        ww.value = 0
        hh.value = 0
    }
</script>