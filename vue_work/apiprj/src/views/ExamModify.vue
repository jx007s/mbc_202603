<template>
    <h2>Exam 수정</h2>
    {{examStore.st}}
    <form ref="examForm" @submit.prevent="backGo" >
            <input type="hidden" v-model="examStore.st.id" name="id">
    <table border="">
        <tr>
            <td>학기</td><td>
                <!-- v-model 인 경우 값이 value와 같을 경우 selected , checked, value 처리 -->
            <input type="radio" name="hakgi" v-model="examStore.st.hakgi" value="1" >1학기
            <input type="radio" name="hakgi" v-model="examStore.st.hakgi" value="2" >2학기
        </td>
        </tr>
        <tr>
            <td>종류</td><td>
        <input type="radio" name="name" v-model="examStore.st.name" value="semi"  >중간
        <input type="radio" name="name" v-model="examStore.st.name" value="final"  >기말
    </td>
        </tr><tr>
            <td>시험일</td><td><input type="date" name="regDate" v-model="examStore.st.regDate" ></td>
        </tr><tr>
            <td>학생</td><td>
            <select name="pid" v-model="examStore.st.pid">
                <option v-for="pid in 'aaa,bbb,ccc,ddd,eee,mmm,nnn,qqq'.split(',')">{{pid}}</option>
            </select>
    </td>
        </tr><tr>
            <td>국어</td> <td><input type="number" name="kor" v-model="examStore.st.kor" ></td>
        </tr><tr>
            <td>영어</td><td><input type="number" name="eng" v-model="examStore.st.eng"></td>
        </tr><tr>
            <td>수학</td><td><input type="number" name="mat" v-model="examStore.st.mat" ></td>
        </tr>
        <tr>
            <td colspan="2" align="right">
                <router-link :to="`/detail/${examStore.st.id}`">뒤로</router-link>
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

    
    await examStore.modify(myFrmData)
    alert('수정되었습니다')
    router.push(`/detail/${examStore.st.id}`)  //detail 로 이동

}
</script>