<template>
        <tr> 
        <td><input type="text" v-model="pname"></td>
        <td><input type="number" v-model.number="jum[0]"></td>
        <td><input type="number" v-model.number="jum[1]"></td>
        <td><input type="number" v-model.number="jum[2]"></td>
        <td>{{tot}}</td>
        <td>{{avg}}</td>
        <td><button @click="remove">삭제</button></td>
    </tr>
    
</template>
<script setup>
import { ref, computed} from 'vue';
import { useExamStore } from './stores/myExam.js';
const store = useExamStore()

const {sid} = defineProps({sid:Number})

const st = store.getStOne(sid)

const pname = ref(st.pname)
const jum = ref(st.jum)

const tot = computed(()=>jum.value.reduce((res,n)=>res+n,0))
const avg = computed(()=>tot.value/jum.value.length)

function remove(){
    //console.log('removeSt', sid)
    store.removeSt(sid)
}
</script>