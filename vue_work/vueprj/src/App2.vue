<template>
    <h1>컴포넌트예제</h1>
    <h1>vue 버전 3</h1>
    <h2>app1이여</h2>
    <p >{{msg}}</p>
    <button @click="go">눌러바</button>

    <!-- 3. 컴포넌트 사용 
        title : 컴포넌트 의 props에 전달
    -->
    <MyBox v-for="bb in arr" :title="bb.title" />

</template>


<script>
    import MyBox from './components/MyBox.vue'; // 1. 파일로드 및 이름지정

    export default {
        components:{
            MyBox     //2. 컴포넌트로 사용하겠다 -- 클래스를 가져오는 개념
        },
        data(){
            return {
                msg:'첫번째메세지',
                arr : [
                    {title:'아기상어'},
                    {title:'엄마상어'},
                    {title:'아빠상어'},
                    {title:'할머니상어'},
                    {title:'할아버지상어'}
                ]
            }
        },
        methods: {
            go(){
                this.msg='첫번째 변신'
            }
        },
    }
</script>

