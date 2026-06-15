import { defineStore } from "pinia";
import { ref } from "vue";

const API_URL = 'http://200.200.200.2'


export const useJwtStore = defineStore('jwt',()=>{
    
    const mainData = ref('')
    const userId = ref('')    //로그인한 정보 넣기

    
    

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

        console.log('status', res.status)

        /// 로그인 하지 않은 상태에서 접근시 다른 페이지로 이동
        if(res.status == 401 || res.status == 403){
            localStorage.removeItem('token')
            alert('권한없음')
            mainData.value = ''
            window.location.href='/login'
            return
        }


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
        
        // 응답객체
        const data = await res.json()

        // 클라이언트(브라우져)에 토큰 저장
        localStorage.setItem('token', data.token)

        //이름 저장
        userId.value = data.userId

    }



    function logoutGo(){  

        // 클라이언트(브라우져)의 토큰 삭제
        localStorage.removeItem('token')
        mainData.value = ''
        window.location.href='/'
    }


    return{
        mainData,
        main,
        gall,
        orderGo,
        loginGo,
        logoutGo,
        userId
    }

    /*

    back : memJwtPrj
    front : memvuejwtprj

    aaa, 1111, 조인성
    bbb, 2222, 정우성
    ccc, 3333, 감우성
    ddd, 4444, 행주산성
    */


})