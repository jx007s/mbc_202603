import { defineStore } from "pinia";
import { ref } from "vue";

const API_URL = "http://200.200.200.2/asy"


export const useCarNumStore = defineStore('car',()=>{

    const car = ref(null)      //데이터 1개

    //쓰기
    async function carSch(frmData){

        const res = await fetch( `${API_URL}/ocr`,{
            method:"POST",
            body:frmData
        })

        car.value = await res.json() 
    }

    return{
        car,
        carSch
    }
})