import { defineStore } from "pinia";
import { ref } from "vue";

const API_URL = "http://200.200.200.2/async"


export const useExamStore = defineStore('exam',()=>{

    const arr = ref([])


    async function examList(pNo=1){  // 1은 초기값

        // query를 자동생성
        const params = new URLSearchParams({
            pNo,
        })
        // params :  pNo=1

        const res = await fetch(`${API_URL}?${params}`)

        arr.value = await res.json()     //리턴을  json 방식으로
    }

    return{
        examList,
        arr
    }
})