import { defineStore } from "pinia";
import { ref } from "vue";

const API_URL = "http://200.200.200.2"


export const useJwtStore = defineStore('jwt',()=>{
    
    const mainData = ref('')
    

    async function main(){  

        const res = await fetch(`${API_URL}/main`)
        mainData.value = await res.text()
    }

    async function gall(){  

        const res = await fetch(`${API_URL}/gall/efewf`)
        mainData.value = await res.text()
    }

    async function orderGo(){  

        const token = localStorage.getItem('token')
        console.log('ordr 보내기전 :', token)
        const res = await fetch(`${API_URL}/order`,{
            headers:{
                Authorization:`Bearer ${token}`
            }
        })
        mainData.value = await res.text()
        //mainData.value = "오더고 데이터"
    }

    async function loginGo(uid){  

        console.log('login보내기전',uid)

        const res = await fetch(`${API_URL}/login`,{
            method:"POST",
            headers:{
                'Content-Type':'application/json'
            },
            body:JSON.stringify({
                uid
            })
        })
        
        // 응답으로 토큰을 받는다
        const token = await res.text()

        // 클라이언트(브라우져)에 저장 -- 브라우져 탭을 닫아도 유지된다. 
        console.log('로그인성공',token)
        localStorage.setItem('token', token)
    }


    return{
        mainData,
        main,
        gall,
        orderGo,
        loginGo
    }
})