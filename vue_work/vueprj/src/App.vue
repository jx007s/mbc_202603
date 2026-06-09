<template>
    <h1>컴포넌트예제</h1>
    <!-- 
    <recToT />
    <Capsule/> 
    <LifeGo/>
    <Exam/>
    <Rec/>
    <ReativeGo/>
    <WatchGo/>
    <ExamGo/>
    <Parent/>
    <EmitRecToT/>
    <EmitExamToT/>
    <PinPar/>
    -->
    <PinRecToT/>
    
    
    
</template>


<script>
    import recToT from './components/computed/recToT.vue'; // 1. 파일로드 및 이름지정
    import Capsule from './components/computed/Capsule.vue';
    import LifeGo from './components/lifecycle/LifeGo.vue';
    import Exam from './components/lifecycle/Exam.vue';
    import Rec from './components/lifecycle/Rec.vue';
    import ReativeGo from './components/ReativeGo.vue';
    import WatchGo from './components/WatchGo.vue';
    import ExamGo from './components/ExamGo.vue';
    import Parent from './components/emittt/Parent.vue';
    import EmitRecToT from './components/emittt/EmitRecToT.vue';
    import EmitExamToT from './components/emittt/EmitExamToT.vue';
    import PinPar from './components/pinia/PinPar.vue';
import PinRecToT from './components/pinia/PinRecToT.vue';
    
    

    export default {
        components:{
            recToT,
            Capsule,
            LifeGo,
            Exam,
            Rec,
            ReativeGo,
            WatchGo,
            ExamGo,
            Parent,
            EmitRecToT,
            EmitExamToT,
            PinPar,
            PinRecToT
        }
    }
</script>

