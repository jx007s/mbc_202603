<template>
    <h1>컴포넌트예제</h1>
    <!-- <recToT /> -->
    <Capsule/>
</template>


<script>
    import recToT from './components/computed/recToT.vue'; // 1. 파일로드 및 이름지정
    import Capsule from './components/computed/Capsule.vue';

    export default {
        components:{
            recToT,
            Capsule
        }
    }
</script>

