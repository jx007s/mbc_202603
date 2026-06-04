<template>
      <h1>02_elv3</h1>
    <h1>vue 버전 3</h1>
    <div id="app1">
        <h2>app1이여</h2>
        <p >{{msg}}</p>
        <button @click="go">눌러바</button>
    </div>
</template>


<script>
    export default {
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

