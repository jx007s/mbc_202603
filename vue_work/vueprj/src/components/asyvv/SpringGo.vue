<template>
<div>
    <h2>스프링 비동기 연결1</h2>
    <button @click="helloGo">helloGo</button>
</div>
</template>
<script setup>
async function helloGo(){
    

    const res = await fetch('http://200.200.200.2/asy/hello')

    console.log('helloGo 실행', await res.text())
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


실습
백앤드와 프론트앤드 둘다 작업 필요
백앤드 (Spring) : 데이터 응답 및 처리

프론트앤드(Vue) : 데이터 비동기 요청과 화면 처리


백앤드
Spring
    @CrossOrigin(origins = "http://200.200.200.2:5173/")  :: 비동기 요청시 Cross 인증 허가 - vue 서버 URL
    @RestContrller
        @RequestMapping("/asy/hello")
            요청시 응답


프론트앤드            
    const res = await fetch("서버URL/asy/hello") :: 비동기 요청
    res ::  응답객체
    응답이 text인 경우 await res.text() 로 데이터 호출


*/
</script>