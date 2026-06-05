<template>
    <div>
        <h1>Exam</h1>
        <div>이름<input v-model="pName"></div>
        <div>국어<input v-model="kor"></div>
        <div>영어<input v-model="eng"></div>
        <div>수학<input v-model="mat"></div>
        <div>총점 : {{tot}}</div>
        <div>평균 : {{avg}}</div>    
    </div>
</template>

<script setup>
    import {ref, computed, onUpdated} from 'vue'

    const rrPName = ref("")
    const rrjum = ref([0,0,0])
    const tot = ref(0)
    const avg = ref(0)

    const pName = computed({
        get(){
            return rrPName.value
        },
        set(vv){
            rrPName.value = vv
        }
    })
    const kor = computed({
        get(){
            return rrjum.value[0]
        },
        set(vv){
            rrjum.value[0] = vv
        }
    })
    const eng = computed({
        get(){
            return rrjum.value[1]
        },
        set(vv){
            rrjum.value[1] = vv
        }
    })
    const mat = computed({
        get(){
            return rrjum.value[2]
        },
        set(vv){
            rrjum.value[2] = vv
        }
    })

    let calcing = false // 업데이트 중인지 확인

    onUpdated(()=>{

        //계산중이라면 밑의 연산을 하지 말고 나가라
        if(calcing){ return }

        calcing = true      //계산중
        tot.value = 0  // 업데이트 발생하여 실행시 여기서도 업데이트 발생->무한루프가 진행된다.
        for (const e of rrjum.value) {
            tot.value += Number(e)
        }
        avg.value = tot.value/rrjum.value.length

        calcing = false // 계산 종료
    })
    

</script>

