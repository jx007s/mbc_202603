<template>
    <div>
        <h1>rec computed</h1>
        <div>가로 : <input type="text" id="ww"></div>
        <div>세로 : <input type="text" id="hh"></div>
        <div>색상 : <input type="color" id="cc"></div>
        <button @click="addRec">입력</button>

        <table border="">
            <tr>
                <td>가로</td>
                <td>세로</td>
                <td>넓이</td>
                <td>둘레</td>
            </tr>
            <tr v-for="rr in recCalc" >
                <td>{{rr.ww}}</td>
                <td>{{rr.hh}}</td>
                <td>{{rr.area}}</td>
                <td>{{rr.border}}</td>
            </tr>
        </table>
        <div id="boxs">
            <Rec v-for="rr in recCalc" :ww="rr.ww" :hh="rr.hh" :cc="rr.cc"  />
        </div>
    </div>

</template>

<script>
import Rec from './rec.vue';
var model ={
            arr:[],
}
export default{

    components:{
        Rec
    },
    data(){
        return model
    },
    computed:{
        recCalc(){
            return this.arr.map(rr=>{
                const area = rr.ww*rr.hh
                const border = (rr.ww+rr.hh)*2

                return {...rr, area, border}
            })
        }
    },
    methods: {
        addRec(){
            const ww = Number(document.querySelector("#ww").value)
            const hh = Number(document.querySelector("#hh").value)
            const cc = document.querySelector("#cc").value
            this.arr.push(
                {
                    ww,
                    hh,
                    cc,
                    // area:ww*hh,
                    // border:(ww+hh)*2
                }
            )
            document.querySelector("#ww").value=''
            document.querySelector("#hh").value=''
        }
    },
}
</script>