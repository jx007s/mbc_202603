<template>
    <div>
        <h3>RouterBtnGo</h3>
        <h4>url</h4>
        <button @click="go('/notice')">notice</button>
        <button @click="go('/gall/hello')">gall</button>
        <h4>params</h4>
        <button @click="pramsGo({service:'modify',id:3})">modify_3</button>
        <button @click="pramsGo({service:'delete',id:5})">delete_5</button>
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

</script>