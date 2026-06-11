<template>
    <h2>Exam 수정</h2>
    {{examStore.st}}
    <form ref="examForm" @submit.prevent="backGo" method="post">
    <table border="">
        <tr>
            <td>학기</td><td>
            <input type="radio" name="hakgi" value="1" <%=dto.getHakgi()==1?"checked":""%> >1학기
            <input type="radio" name="hakgi" value="2" <%=dto.getHakgi()==2?"checked":""%> >2학기
        </td>
        </tr><tr>
            <td>종류</td><td>
        <input type="radio" name="name" value="semi" <%=dto.getName().equals("semi")?"checked":""%> >중간
        <input type="radio" name="name" value="final" <%=dto.getName().equals("final")?"checked":""%> >기말
    </td>
        </tr><tr>
            <td>시험일</td><td><input type="date" name="regDate" value="<%=dto.getRegDate()%>"></td>
        </tr><tr>
            <td>학생</td><td>
            <select name="pid">
<% for (String pid : "aaa,bbb,ccc,ddd,eee,mmm,nnn,qqq".split(",")) { %>
                <option <%=dto.getPid().equals(pid)?"selected":""%>><%=pid%></option>
<%}%>
            </select>
    </td>
        </tr><tr>
            <td>국어</td> <td><input type="number" name="kor" value="<%=dto.getKor()%>"></td>
        </tr><tr>
            <td>영어</td><td><input type="number" name="eng" value="<%=dto.getEng()%>"></td>
        </tr><tr>
            <td>수학</td><td><input type="number" name="mat" value="<%=dto.getMat()%>"></td>
        </tr>
        <tr>
            <td colspan="2" align="right">
                <router-link :to="`/?pNo=${examStore.pNo}`">목록으로</router-link>
                <input type="submit" value="수정">
            </td>
        </tr>
    </table>
    </form>

</template>
<script setup>
import { useExamStore } from '@/stores/ExamStore';
import { ref } from 'vue';
import { onMounted } from 'vue';
import { useRoute, useRouter } from 'vue-router';

const route = useRoute()
const router = useRouter()
const examStore = useExamStore()

const id = route.params.id

onMounted(async ()=>{
    console.log('modify', id)
    await examStore.detail(id)
})

const examForm = ref(null)


async function backGo(){
    
    const myFrmData = new FormData(examForm.value)

    
    //await examStore.write(myFrmData)
    alert('수정되었습니다')
    router.push(`/detail/${examStore.st.id}`)  //detail 로 이동

}
</script>