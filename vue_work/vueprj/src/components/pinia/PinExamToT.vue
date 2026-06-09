<template>
    <div>
        <h2>PinExamToT</h2>

        <PinExamAdd/>
        <table border="">
            <tr>
                <td>이름</td>
                <td>국어</td>
                <td>영어</td>
                <td>수학</td>
                <td>총점</td>
                <td>평균</td>
            </tr>
            <PinExam v-for="st in store.arr" :sid="st.sid" :key="st.sid" /> 
            <tr>
                <td>합계</td>
                <td>{{store.tt.jum[0]}}</td>
                <td>{{store.tt.jum[1]}}</td>
                <td>{{store.tt.jum[2]}}</td>
                <td>{{store.tt.total}}</td>
                <td>{{store.tt.avg}}</td>
            </tr>
        </table>

    </div>
</template>
<script setup>
import PinExamAdd from './PinExamAdd.vue';
import PinExam from './PinExam.vue';
import { useExamStore } from './stores/myExam.js';
const store = useExamStore()

</script>