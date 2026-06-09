import { defineStore } from "pinia";
import { reactive, watch } from "vue";

let no = 0;
export const useExamStore = defineStore('exam',()=>{
    
    const arr = reactive([
                    {sid:no++, pname:'현빈', jum:[67,68,69]},
                    {sid:no++, pname:'원빈', jum:[87,88,89]},
                ])

    function getStOne(sid){
        return arr.find(st => st.sid === sid)
    }


    function addRow(newData){
        arr.push( {sid:no++,...newData  })
    }

    function removeSt(i){
        const index = arr.findIndex(st=>st.sid===i)
        console.log('removeStttt', index)
        arr.splice(index, 1)
    }


    const tt = reactive({jum:[0,0,0],total:0, avg:0})

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

    return {arr , getStOne, addRow, removeSt, tt}
})