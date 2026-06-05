<template>
    <div>
        <h3>Part</h3>
        part-msg : {{msg}}
        <br/>
        age : <input v-model="age">
        <br/>
    </div>

</template>

<script setup>  //setup() 의 vue3 버전 - 1. 컴포넌트 생성시 최초 실행
    import { onMounted, onUpdated, onUnmounted, ref, computed } from 'vue';
    console.log("Part setup 실행")


    const msg = ref('part-초기값이지롱')

    const age = computed({            // computed:{pName:{get(){}, set(val){}} 과 같음

        get(){
            console.log(`age get()`)
            return msg.value
        },
        set(val){
            console.log(`age set() : ${val}`)
            msg.value = val
        }
        
    })

    onUpdated(()=>{
        console.log("Part onUpdated 실행")

    })
    onMounted(()=>{
        console.log("Part onMounted 실행")

    })
   
    onUnmounted(()=>{
        console.log("Part onUnmounted 실행")

    })
</script>