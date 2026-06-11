<template>
    <h2>Exam 추가</h2>

    <form ref="examForm" @submit.prevent="backGo" method="post" enctype="multipart/form-data">
    <table border="">
        <tr>
            <td>학기</td><td>
            <input type="radio" name="hakgi" value="1">1학기
            <input type="radio" name="hakgi" value="2">2학기
        </td>
        </tr><tr>
            <td>종류</td><td>
        <input type="radio" name="name" value="semi">중간
        <input type="radio" name="name" value="final">기말
    </td>
        </tr><tr>
            <td>시험일</td><td><input type="date" name="regDate"></td>
        </tr><tr>
            <td>학생</td><td>
            <select name="pid">
                <option>aaa</option>
                <option>bbb</option>
                <option>ccc</option>
                <option>ddd</option>
                <option>eee</option>
                <option>mmm</option>
                <option>nnn</option>
                <option>qqq</option>
            </select>
    </td>
        </tr><tr>
            <td>국어</td> <td><input type="number" name="kor"></td>
        </tr><tr>
            <td>영어</td><td><input type="number" name="eng"></td>
        </tr><tr>
            <td>수학</td><td><input type="number" name="mat"></td>
        </tr><tr>
            <td>파일</td><td><input type="file" name="upFile"></td>
        </tr>
        <tr>
            <td colspan="2" align="right">
                <router-link :to="`/?pNo=${examStore.pNo}`">목록으로</router-link>
                <input type="submit" value="등록">
            </td>
        </tr>
    </table>
    </form>

</template>
<script setup>
import { useExamStore } from '@/stores/ExamStore';
import { ref } from 'vue';
import { useRouter } from 'vue-router';

const examStore = useExamStore()
const examForm = ref(null)
const router = useRouter()

async function backGo(){
    //console.log("백앤드 가즈아")
    const myFrmData = new FormData(examForm.value)

    //console.log(myFrmData)
    await examStore.write(myFrmData)

    console.log(`write ${examStore.st.id}`)

    router.push(`/detail/${examStore.st.id}`)  //detail 로 이동

}
</script>