<template>
    <div>
        <h2>EmitRecToT</h2>
        <EmitRecAdd @addRow="addRow"/>
        <table border="">
            <tr>
                <td>가로</td>
                <td>세로</td>
                <td>넓이</td>
                <td>둘레</td>
            </tr>
            <!-- (rr:데이터, i:인덱스)-->
            <EmitRec v-for="rr in arr" :key="rr.rid" :data="rr" @removeRow="removeRow"/>
            
            <tr>
                <td></td>
                <td></td>
                <td>{{totalArea}}</td>
                <td>{{avgBorder}}</td>
            </tr>

        </table>
    </div>
</template>
<script setup>
import { reactive, computed } from 'vue';
import EmitRec from './EmitRec.vue';
import EmitRecAdd from './EmitRecAdd.vue';

let no = 1

//전체 직사각형 데이터
const arr = reactive([
    {rid:no++, ww:4, hh:5},
    {rid:no++, ww:10, hh:10},
    {rid:no++, ww:7, hh:8},
    {rid:no++, ww:6, hh:10}
])

// 넓이들의 합계 - 자동 계산식
const totalArea = computed(()=>{
    return arr.reduce((tot, rr)=> tot + rr.ww*rr.hh , 0)
})
// 둘레들의 평균 - 자동 계산식
const avgBorder = computed(()=>{
    return arr.reduce((tot, rr)=> tot + (rr.ww+rr.hh)*2 , 0) / arr.length
})


function addRow(newData){
    arr.push( {rid:no++, ...newData} )
}

function removeRow(i){
    const index = arr.findIndex(rr=> rr.rid == i)  //삭제하고하 하는 id 의 실제 배열순서
    arr.splice(index,1)  // splice(번호, 갯수)  : arr의 번호번째의 갯수만큼 삭제
}

</script>