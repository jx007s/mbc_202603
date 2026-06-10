<template>
    <div>
        <h3>RouterBtnGo</h3>
        <h4>url</h4>
        <button @click="go('/notice')">notice</button>
        <button @click="go('/gall/hello')">gall</button>
        <h4>params</h4>
        <button @click="pramsGo({service:'modify',id:3})">modify_3</button>
        <button @click="pramsGo({service:'delete',id:5})">delete_5</button>
        <h4>query</h4>
        <button @click="queryGo({service:'modify',id:3})">modify_3</button>
        <button @click="queryGo({service:'delete',id:5})">delete_5</button>
        <h4>history</h4>
        <button @click="backkk">뒤로</button>
        <button @click="forwarddd">앞으로</button>
        <button @click="gogo(-1)">go-1</button>
        <button @click="gogo(1)">go1</button>
    </div>
</template>
<script setup>
import { useRouter } from 'vue-router';


const router = useRouter()

function go(goUrl){
    router.push(goUrl)
}
function pramsGo({service, id}){
    router.push({
        name:'user',
        params:{
            service,
            id
        }
    })
}
function queryGo({service, id}){
    router.push({
        path:'/about',
        query:{
            service,
            id
        }
    })
}

//  router/index.js의 
//  history: createWebHistory(import.meta.env.BASE_URL), 
// 로 url의 이동 위치를 기억
function backkk(){
    router.back()  //뒤로
}
function forwarddd(){
    router.forward()//앞으로
}
function gogo(no){
    router.go(no) // 숫자만큼 이동  -2, -1 : 뒤로 2, 1
                    //             2 , 1 : 앞으로 2,1
}
</script>