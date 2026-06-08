<template>
    <div>
        <h2>watch</h2>

        <div> no : {{no}}</div>
        <div> nick : {{nick}}</div>
        <div> cate : {{cate}}</div>

        <div> mem : {{mem}}</div>
        <div> mem.pname : {{mem.pname}}</div>
        <div> mem.age : {{mem.age}}</div>
        <div> mem.marriage : {{mem.marriage}}</div>
        <button @click="changeNo">no변경</button>
        <button @click="changeNick">nick변경</button>
        <button @click="changeCate">cate변경</button>
        <button @click="changeMem('아빠상어', 41, false)">mem변경</button>
        <div> total : {{total}}, {{totalMem}}</div>
    </div>
</template>
<script setup>
import { ref, reactive, watch, watchEffect } from 'vue';

const no = ref(0)
const nick = ref('현빈')
const cate = ref('회사소개')
const total = ref(0)
const totalMem = ref(0)

const mem = reactive({      // 객체 데이터
    pname:'아기상어',
    age: 17,
    marriage: false
})

function changeNo(){
    no.value++

}

function changeCate(){
    cate.value='회안사소개'

}
let cnt = 0
function changeNick(){
    nick.value= nick.value+cnt++

}

function changeMem(nPname, nAge, nMarriage){
    mem.pname = nPname              //reactive : value 사용안함
    mem.age = nAge+cnt++
    mem.marriage = nMarriage
}

// 감시할 대상을 직접 지정하여 이전값/새로운값 둘다 제공
// 특정 데이터 정밀 감시가 목적
watch(no,(newVal, oldVal)=>{

    console.log(`no 감시 : ${newVal}, ${oldVal}`)
})

watch(mem,(newVal, oldVal)=>{

    console.log(`mem 감시 : ${newVal.pname}, ${newVal.age} <=  ${oldVal.pname}, ${oldVal.age}`)
    totalMem.value++
})

/* 직접적인 ref와 reactive 감시 만 가능
watch(mem.pname,(newVal, oldVal)=>{

    console.log(`mem.pname 감시 : ${newVal} <=  ${oldVal}`)
})*/


// 모든 ref, reactive, computed 자동 추적
watchEffect(()=>{
    console.log(`watchEffect 시작 ------`)
    console.log(`no  : ${no.value}`)
    console.log(`nick  : ${nick.value}`)
    console.log(`cate  : ${cate.value}`)
    console.log(`mem  : ${mem.pname}, ${mem.age}, ${mem.marriage}`)
    total.value++
    console.log(`watchEffect 끝 ------`)
})

</script>