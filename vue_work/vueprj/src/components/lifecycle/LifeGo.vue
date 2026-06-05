<template>
    <div>
        <h2>LifeCycle</h2>
        msg : {{msg}}
        <br/>
        pName : <input v-model="pName">
        <br/>
        <button @click="togglePP">{{ppView ? 'part제거' :"part생성" }}</button>
        <Part v-if="ppView"/>
    </div>

</template>




<script setup> 

    import { onMounted, onUpdated, onUnmounted, ref, computed } from 'vue';
    import Part from './Part.vue';

    const ppView = ref(false)           // data() { return {ppView:true }} 와 같음
    const msg = ref('초기값이지롱')

    const pName = computed({            // computed:{pName:{get(){}, set(val){}} 과 같음

        get(){
            console.log(`pName get()`)
            return msg.value
        },
        set(val){
            console.log(`pName set() : ${val}`)
            msg.value = val
        }
        
    })

    function togglePP(){                // methods : { togglePP() {} }  와 같음
       ppView.value = !ppView.value     // this.ppView = !this.ppView 와 같음
    }


    // 라이프사이클 훅
    onMounted(()=>{
        console.log("LifeGo onMounted 실행")

    })
    onUpdated(()=>{
        console.log("LifeGo onUpdated 실행")

    })
    onUnmounted(()=>{
        console.log("LifeGo onUnmounted 실행")

    })
    console.log("LifeGo setup 실행")

 //setup() 의 vue3 버전 - 1. 컴포넌트 생성시 최초 실행
                // Composition API 방식
/* 
Composition API   VS  Options API

[[Options API]]

export default {
    ...
    methods:{
        ....
    },
    data(){
        return {
            ...
        }
    }
}

[[Composition API]]
import {ref} from 'vue'
import Part from './Part.vue';
...

*/
</script>

