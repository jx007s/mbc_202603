<template>
    <tr>
        <td><input type="text" v-model.number="ww"/></td>
        <td><input type="text" v-model.number="hh"/></td>
        <td>{{area}}</td>
        <td>{{border}}</td>
        <td><button @click="remove">삭제</button></td>
    </tr>
</template>
<script setup>
import { toRefs, computed } from 'vue';
import { useRecStore } from './stores/myRec.js';

const store = useRecStore()
    
    //부모가 보내준 객체 받기 -- 수정 불가 (읽기 전용)
    const props = defineProps({
        data:Object
    })

    // toRefs : props -> ref로 변경하여 처리
    const {ww, hh, rid} = toRefs(props.data)

    // computed로 자동계산식 적용
    const area = computed(()=> ww.value * hh.value)
    const border = computed(()=> (ww.value + hh.value) * 2)

    function remove(){
        store.removeRow(rid.value)
    }


</script>