<template>
    <h2>자동차검색</h2>

    <form ref="carForm" @submit.prevent="backGo" method="post" enctype="multipart/form-data">
    <table border="">
        <tr>
            <td>이름</td> <td><input type="text" name="pname"></td>
        </tr><tr>
            <td>나이</td><td><input type="number" name="age"></td>
        </tr><tr>
            <td>파일</td><td><input type="file" name="ff"></td>
        </tr>
        <tr>
            <td colspan="2" align="right">
                <input type="submit" value="검색">
            </td>
        </tr>
    </table>
    </form>

</template>
<script setup>
import { useCarNumStore } from '@/stores/CarNumStore';
import { ref } from 'vue';
import { useRouter } from 'vue-router';

const store = useCarNumStore()
const carForm = ref(null)
const router = useRouter()

async function backGo(){
    //console.log("백앤드 가즈아")
    const myFrmData = new FormData(carForm.value)

    //console.log(myFrmData)
    await store.carSch(myFrmData)

    router.push(`/`)  // home으로 이동

}
</script>