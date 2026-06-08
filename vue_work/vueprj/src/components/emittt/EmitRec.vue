<template>
    <tr>
        <td>{{ww}}</td>
        <td>{{hh}}</td>
        <td>{{area}}</td>
        <td>{{border}}</td>
    </tr>
</template>
<script setup>
import { toRefs, computed } from 'vue';

    
    //부모가 보내준 객체 받기 -- 수정 불가 (읽기 전용)
    const props = defineProps({
        data:Object
    })

    // toRefs : props -> ref로 변경하여 처리
    const {ww, hh} = toRefs(props.data)

    const area = computed(()=> ww.value * hh.value)
    const border = computed(()=> (ww.value + hh.value) * 2)


</script>