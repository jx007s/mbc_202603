<template>
    <h2>Exam 목록</h2>
    <div v-if="examStore.loading">
        로딩중이여
    </div>
    <div v-else>
        <table border="">

        <tr>
            <td>학기</td>
            <td>종류</td>
            <td>시험일</td>
            <td>학생</td>
            <td>국어</td>
            <td>영어</td>
            <td>수학</td>
        </tr>
        <tr v-for="st in examStore.arr" :key="st.id">
            <td>{{st.hakgi}}</td>
            <td>{{st.name}}</td>
            <td>{{st.regDate}}</td>
            <td>
                <router-link :to="`/detail/${st.id}`">{{st.pid}}</router-link>
            </td>
            <td>{{st.kor}}</td>
            <td>{{st.eng}}</td>
            <td>{{st.mat}}</td>
        </tr>
        <tr>
            <td colspan="7">
                <button v-for="pNo in [1,2,3,4,5,6,7,8,9,10]" @click="movePage(pNo)">{{pNo}}</button>
            </td>
        </tr>
        </table>
    </div>
</template>
<script setup>
import { useExamStore } from '@/stores/ExamStore';
import { onMounted } from 'vue';

const examStore = useExamStore()

onMounted(async ()=>{
    await examStore.examList(12)
})

async function movePage(pNo){
    console.log(pNo)
    await examStore.examList(pNo)
}

</script>