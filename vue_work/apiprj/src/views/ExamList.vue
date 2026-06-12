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
                <button v-if="examStore.pages.before" @click="movePage(examStore.pages.before)">이전</button>
                <template v-for="pNo in examStore.pages.arr" >
                    <span v-if="examStore.pNo == pNo">[{{pNo}}]</span>
                    <button v-else @click="movePage(pNo)">{{pNo}}</button>
                </template>
                <button v-if="examStore.pages.after" @click="movePage(examStore.pages.after)">다음</button>
            </td>
        </tr>
        </table>
    </div>
</template>
<script setup>
import { useExamStore } from '@/stores/ExamStore';
import { onMounted } from 'vue';
import { useRoute } from 'vue-router';

const examStore = useExamStore()
const route = useRoute()

onMounted(async ()=>{
    const pNo = route.query.pNo || 1  // ?pNo=8  존재하면 pNo=8  없으면 pNo=1
    await examStore.examList(pNo)
})

async function movePage(pNo){
    console.log(pNo)
    await examStore.examList(pNo)
}

</script>