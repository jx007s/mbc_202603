<template>
    <div>
        <h2>EmitExamToT</h2>

        <EmitExamAdd @addRow="addRow"/>
        <table border="">
            <tr>
                <td>이름</td>
                <td>국어</td>
                <td>영어</td>
                <td>수학</td>
                <td>총점</td>
                <td>평균</td>
            </tr>
            <EmitExam v-for="st in arr" :data="st" :key="st.sid" @removeSt="removeSt" /> 
            <tr>
                <td>합계</td>
                <td>{{tt.jum[0]}}</td>
                <td>{{tt.jum[1]}}</td>
                <td>{{tt.jum[2]}}</td>
                <td>{{tt.total}}</td>
                <td>{{tt.avg}}</td>
            </tr>
        </table>

    </div>
</template>
<script setup>


import {reactive, watch} from 'vue';
import EmitExamAdd from './EmitExamAdd.vue';
import EmitExam from './EmitExam.vue';
let no = 0;
const arr = reactive([
                {sid:no++, pname:'현빈', jum:[67,68,69]},
                {sid:no++, pname:'원빈', jum:[87,88,89]},
            ])

const tt = reactive({jum:[0,0,0],total:0, avg:0})

function addRow(newData){
    arr.push( {sid:no++,...newData  })
}

function removeSt(i){
    const index = arr.findIndex(st=>st.sid===i)
    console.log('removeStttt', index)
    arr.splice(index, 1)
}

watch(arr, newArr=>{

    newArr.forEach(st=>{
        st.tot = st.jum.reduce((a,b)=> a+b,0)
        st.avg = st.tot / st.jum.length
    })

    tt.jum=[0,0,0]
    tt.total = 0

    newArr.forEach(st=>{
        st.jum.forEach((jj, i)=>{
            tt.jum[i] += jj
            tt.total +=  jj
        })
    })
    tt.avg = tt.total/ 3
})

</script>