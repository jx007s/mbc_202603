<template>
<div>
    <h2>스프링 비동기 연결1</h2>
    <button @click="helloGo">helloGo</button>
</div>
</template>
<script setup>
async function helloGo(){
    

    const res = await fetch('http://200.200.200.2/asy/hello')

    console.log('helloGo 실행', res)
}

/* 
비동기 호출
개념 : 컴포넌트의 렌더링 실행시간과 상관없이 비동기적으로 외부 데이터를 가져오는 방식
fetch, promise, axios

사용방법
async , await, try~catch 필요

async function 함수명(){

    try{
        await fetch(데이터받을서버주소)
    }catch(e){

    }

}


*/
</script>