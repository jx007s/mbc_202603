<template>
    <div class="box" :style="{width: `${rr.ww}px`, height:`${rr.hh}px`, backgroundColor:rr.cc }">
        넓이:{{area}}<br/>
        둘레:{{border}}
    </div>

</template>

<script>
export default{
    props:{
        rr:{type:Object, required:true}  //객체로 받음
    },
    computed:{
        area(){
            return this.rr.ww* this.rr.hh
        },
        border(){
            return (this.rr.ww + this.rr.hh)* 2
        }
    }
    
}
</script>

 <style>
    .box{
        margin: 5px;
        border: 1px solid #888;
        /* background-color: #ff0; */
        float: left;
    }
</style>