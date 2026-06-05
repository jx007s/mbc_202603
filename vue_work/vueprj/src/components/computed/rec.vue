<template>
    <div class="box" :style="{width: `${ww}px`, height:`${hh}px`, backgroundColor:cc }">
        넓이:{{area}}<br/>
        둘레:{{border}}
    </div>

</template>

<script>
export default{
    props:['ww','hh','cc'],
    computed:{
        area(){
            return this.ww* this.hh
        },
        border(){
            return (this.ww + this.hh)* 2
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