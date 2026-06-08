<template>
    <div>
        <h2>emit</h2>
        <!-- 자식과 연결할 함수 설정 @자식emit함수명='부모함수명' -->
        <ChildGo @asdf="bbb" @zxcv="ddd"/>
    </div>

</template>

<script setup>
import ChildGo from './ChildGo.vue';

function bbb(){
    console.log(`부모 bbb() 실행`)
}

function ddd(qqq){  // 자식이 보낸 데이터를 매개변수 qqq로 받음
    console.log(`부모 ddd() 실행 ${qqq.pname}, ${qqq.age}`)
}

</script>