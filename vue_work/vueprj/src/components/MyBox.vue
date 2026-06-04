<template>
    <div class="box">
        <h3>{{title}}</h3>
        <p>{{msg}}</p>
    </div>
</template>

<script>
    export default{
        data(){
            return {
                title:'제목인가',
                msg:'메세지인가'
            }
        }
    }
</script>

<style>
.box{
    border: 1px solid #333;
    padding: 10px;
    margin: 5px;
}
</style>