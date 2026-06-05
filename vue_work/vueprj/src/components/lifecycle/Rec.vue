<template>
    <div>
        <h1>Rec</h1>
       
        <div>가로<input v-model="ww"></div>
        <div>세로<input v-model="hh"></div>
        
        <div>넓이 : {{area}}</div>
        <div>둘레 : {{border}}</div>    
    </div>
</template>

<script setup>
    import {ref, onUpdated} from 'vue'

    const ww = ref(0)
    const hh = ref(0)
    const area = ref(0)
    const border = ref(0)

    

    let calcing = false // 업데이트 중인지 확인

    onUpdated(()=>{

        //계산중이라면 밑의 연산을 하지 말고 나가라
        if(calcing){ return }

        calcing = true      //계산중
        area.value = ww.value * hh.value
        border.value = (Number(ww.value) + Number(hh.value)) * 2
        

        calcing = false // 계산 종료
    })
    

</script>

