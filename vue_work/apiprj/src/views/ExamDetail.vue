<template>
    <h2>Exam 상세</h2>
    <div v-if="examStore.loading">
        로딩중이여
    </div>
    <div v-else>
        상세 내용이지 {{examStore.st}}

        <table border="">
        <tr>
            <td>학기</td><td>{{examStore.st.hakgi}}</td>
        </tr><tr>
            <td>종류</td><td>{{examStore.st.name}}</td>
        </tr><tr>
            <td>시험일</td><td>{{examStore.st.regDate}}</td>
        </tr><tr>
            <td>학생</td><td>{{examStore.st.pid}}</td>
        </tr><tr>
            <td>국어</td> <td>{{examStore.st.kor}}</td>
        </tr><tr>
            <td>영어</td><td>{{examStore.st.eng}}</td>
        </tr><tr>
            <td>수학</td><td>{{examStore.st.mat}}</td>
        </tr>
        <% if(dto.getUpFF()!=null){%>
       
        <%} %>
        <tr>
            <td colspan="2" align="right">
                <a href="list?pNo=<%=pInfo.getPNo}}">목록으로</a>
                <a href="modifyForm?pNo=<%=pInfo.getPNo}}&id={{st.Id}}">수정</a>
                <a href="delete?pNo=<%=pInfo.getPNo}}&id={{st.Id}}">삭제</a>
            </td>
        </tr>
    </table>
    </div>
</template>
<script setup>
import { useExamStore } from '@/stores/ExamStore';
import { onMounted } from 'vue';
import { useRoute } from 'vue-router';

const route = useRoute()
const examStore = useExamStore()

const id = route.params.id

onMounted(async ()=>{
    console.log('detail', id)
    await examStore.detail(id)
})


</script>