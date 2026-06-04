<template>
    <h1>컴포넌트예제</h1>
    <h1>vue 버전 3</h1>
    <h2>app1이여</h2>
    <p >{{msg}}</p>
    <button @click="go">눌러바</button>

    <!-- 컴포넌트 사용 -->
    <MyBox />
    <MyBox />
    <MyBox />
    <MyBox />

</template>


<script>
    import MyBox from './components/MyBox.vue';

    export default {
        components:{
            MyBox     //컴포넌트로 사용하겠다
        },
        data(){
            return {msg:'첫번째메세지'}
        },
        methods: {
            go(){
                this.msg='첫번째 변신'
            }
        },
    }
</script>

