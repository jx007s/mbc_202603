<template>
    <h1>컴포넌트예제</h1>
    <recToT />

</template>


<script>
    import recToT from './components/computed/recToT.vue'; // 1. 파일로드 및 이름지정

    export default {
        components:{
            recToT     //2. 컴포넌트로 사용하겠다 -- 클래스를 가져오는 개념
        }
    }
</script>

