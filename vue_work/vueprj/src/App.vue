<template>
    <h1>컴포넌트예제</h1>
    <!-- 
    <recToT />
    <Capsule/> 
    <LifeGo/>
    <Exam/>
    -->
    <Rec/>
</template>


<script>
    import recToT from './components/computed/recToT.vue'; // 1. 파일로드 및 이름지정
    import Capsule from './components/computed/Capsule.vue';
    import LifeGo from './components/lifecycle/LifeGo.vue';
    import Exam from './components/lifecycle/Exam.vue';
    import Rec from './components/lifecycle/Rec.vue';

    export default {
        components:{
            recToT,
            Capsule,
            LifeGo,
            Exam,
            Rec
        }
    }
</script>

