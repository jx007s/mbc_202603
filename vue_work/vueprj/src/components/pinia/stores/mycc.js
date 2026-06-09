// Store를 생성하기 위한 함수
import { defineStore } from "pinia";
import { computed, ref } from "vue";


export const useCounterStore = defineStore('counter',()=>{
// counter 스토어 생성 :: 'counter'  스토어의 이름 , 다른 스토어와 구분하기 위한 구분자(겹치면 안됌)
// 메소드명이 달라야 하는 이유 : 컴포넌트에서 import 시 에러나지 않게 하기 위함


    // 상태(데이터)인 변수 생성 -- ref로 반응형 변수로 처리
    const count = ref(10)


    // Getter
    const ddCount = computed(()=> count.value * 2)


    //로직 1 --> 각 컴포넌트에서 호출하여 변수 값을 쉽게 변경토록 한다
    const countAdd = () =>{
        count.value++
    }

    //로직 2
    const countSub = () =>{
        count.value--
    }

    // 외부 공개용 데이터
    return {
        count,  
        ddCount,        
        countAdd,
        countSub
    }
})