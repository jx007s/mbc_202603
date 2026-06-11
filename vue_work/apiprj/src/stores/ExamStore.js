import { defineStore } from "pinia";
import { ref } from "vue";

const API_URL = "http://200.200.200.2/async"


export const useExamStore = defineStore('exam',()=>{

    const arr = ref([])     //목록
    const pNo = ref(1)      //페이지번호
    const st = ref({})    //데이터 1개


    async function examList(currNo=1){  // 1은 초기값

        pNo.value = currNo  //페이지번호를 스토어에서 저장

        // query를 자동생성
        const params = new URLSearchParams({
            pNo:pNo.value,
        })
        // params :  pNo=1

        const res = await fetch(`${API_URL}?${params}`)

        arr.value = await res.json()     //리턴을  json 방식으로
    }

    //상세
    async function detail(id){

        const res = await fetch(`${API_URL}/${id}`)

        st.value = await res.json()     //리턴을  json 방식으로
    }


    //쓰기
    async function write(frmData){

        const res = await fetch( API_URL,{
            method:"POST",
            body:frmData
        })

        st.value = {id:await res.text()}     //리턴을  json 방식으로
    }

    return{
        examList,
        arr,
        detail,
        st,
        pNo,
        write
    }
})