<template>
    <div>
        <div>이름 : <input type="text" v-model="pname"></div>
        <div>국어 : <input type="number" v-model.number="kor"></div>
        <div>영어 : <input type="number" v-model.number="eng"></div>
        <div>수학 : <input type="number" v-model.number="mat"></div>
        <button @click="addStud">입력</button>
    </div>
</template>
<script setup>
import { ref, reactive, watch} from 'vue';
const emit = defineEmits(['addRow'])

const pname=ref('')
const kor = ref(0)
const eng = ref(0)
const mat = ref(0)

function addStud(){
  
    emit('addRow',{
        pname : pname.value,
        jum : [kor.value,
                eng.value,
                mat.value]
    })

    // 입력폼 초기화
    pname.value=''
    kor.value=0
    eng.value=0
    mat.value=0
}



</script>