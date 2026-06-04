<template>
    <div class="box">
        <h3>{{title}}</h3>
        <p>{{msg}}</p>
    </div>
</template>

<script>
    export default{
        props:['title'],        //부모로 부터 받는 데이터 <MyBox title="1번박스" />  title인 "1번박스"를 가져옴
        data(){
            return {
               // title:'강사제목이지롱',  //부모로부터 받아서 사용할 것임
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