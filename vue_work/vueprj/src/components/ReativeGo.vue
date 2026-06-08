<template>
    <div>
        <h2>ref VS reactive</h2>
        <div> no : {{no}}</div>
        <div> no2 : {{no2}}</div>

        <div> mem : {{mem}}</div>
        <div> mem.pname : {{mem.pname}}</div>
        <div> mem.age : {{mem.age}}</div>
        <div> mem.marriage : {{mem.marriage}}</div>

        <div> mem2 : {{mem2}}</div>
        <div> mem2.pname : {{mem2.pname}}</div>
        <div> mem2.age : {{mem2.age}}</div>
        <div> mem2.marriage : {{mem2.marriage}}</div>

        <button @click="changeNo">no변경</button>
        <button @click="changeMem('아빠상어', 41, false)">mem변경</button>
    </div>
</template>

<script setup>
import {ref, reactive} from 'vue'

function changeNo(){
    //no++
    no.value++
    //no2++
    //no2.value++  둘다 에러
}

function changeMem(nPname, nAge, nMarriage){
    mem.pname = nPname              //reactive : value 사용안함
    mem.age = nAge
    mem.marriage = nMarriage

    mem2.value.pname = nPname       //ref인 경우 value 이후에 property 수정
    mem2.value.age = nAge
    mem2.value.marriage = nMarriage
}

const no = ref(0)           // 단일 데이터
const no2 = reactive(10)    //에러 발생

const mem = reactive({      // 객체 데이터
    pname:'아기상어',
    age: 17,
    marriage: false
})

const mem2 = ref({
    pname:'엄마상어',
    age: 37,
    marriage: true
})

</script>