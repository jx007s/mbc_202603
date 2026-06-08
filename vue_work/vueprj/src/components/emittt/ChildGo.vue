<template>
    <div>
        <h3>ChildGo</h3>
        <button @click="aaa">자식에서 클릭aaa</button>
        <button @click="ccc">자식에서 클릭ccc</button>
    </div>

</template>

<script setup>
const emit = defineEmits(['asdf, zxcv'])  //부모와 연결할 함수이름을 배열형태로 기재

function aaa(){  //aaa 함수 실행시
    console.log(`자식 aaa() 실행`)
    emit('asdf')    // 부모에서 연결한 asdf 이벤트 발생
}

function ccc(){  //ccc 함수 실행시
    console.log(`자식 ccc() 실행`)
    emit('zxcv',
    {
        pname:'아기상어',       // 부모 이벤트에 데이터전송(매개변수)
        age:10
    })    
}

</script>