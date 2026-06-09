<template>
    <div>
        <h2>pinia 부모</h2>
        <p> 부모 count : {{store.count}}</p>
        <p> 부모 ddCount : {{store.ddCount}}</p>
        <PinChild/>
    </div>
</template>
<script setup>
import { useCounterStore } from './stores/mycc.js';
import PinChild from './PinChild.vue';
import { provide } from 'vue';

const store = useCounterStore()  // 정의한 스토어 생성

provide('myStore', store)  // 하위 컴포넌트에  store 전달 : 전달이름 myStrore
/*

Pinia : Vue 공식 상태 관리 라이브러리
store 에 데이터를 저장하고 사용하는 것이 목적
Props나 이벤트(emit)전달 없이 쉽게 공유하고 변경
Vuex와 차이점을 가진 차세대 라이브러리

상태 : State    -- ref, reactive
속성 : Getter   -- computed
로직 : Action   -- function

store.js 필요

논리구조
Parent.vue
 └─ Child.vue
      └─ GrandChild.vue
Parent에서 provide → GrandChild에서도 inject 가능 


파일구조
...
pinia
 |- stores
 |    └ counter.js
 |- PinPar.vue
 |- PinChild.vue
 |- PinGrandChild.vue


중간 Child 컴포넌트는 props 없이 count 접근 가능 



store 결합

1. 직접생성및 사용
import { useCounterStore } from './stores/mycc.js';
const store = useCounterStore() 

2. store 전달
부모에서 전달
provide('myStore', store) 

자식에서 전달받은 store 사용
import { inject } from 'vue';
const store = inject('myStore')
*/

</script>
