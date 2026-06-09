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
import { toRefs, computed} from 'vue';
const emit = defineEmits(['removeSt'])

const props = defineProps({
    data:Object
})

const {pname, jum, sid} = toRefs(props.data)
const tot = computed(()=>jum.value.reduce((res,n)=>res+n,0))
const avg = computed(()=>tot.value/jum.value.length)

function remove(){
    console.log('removeSt', sid.value)
    emit('removeSt', sid.value)
}
</script>