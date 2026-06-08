<template>
    <div>
        <h2>ExamGo</h2>

        <div>이름 : <input type="text" v-model="pname"></div>
        <div>국어 : <input type="number" v-model.number="kor"></div>
        <div>영어 : <input type="number" v-model.number="eng"></div>
        <div>수학 : <input type="number" v-model.number="mat"></div>
        <button @click="addStud">입력</button>

        <table border="">
            <tr>
                <td>이름</td>
                <td>국어</td>
                <td>영어</td>
                <td>수학</td>
                <td>총점</td>
                <td>평균</td>
            </tr>
            <!-- <tr v-for="st in arr" > 기본 데이터만 출력-->
                <tr v-for="st in arr" > <!--컴퓨티드(studs)에 의해 계산된 결과를 출력
                                                컴퓨티드 함수는 함수 정의명으로만 호출
                                                매개변수를 넣을 수 없다 ==> studs() 불가
                                                                        studs 가능
                    -->
                <td>{{st.pname}}</td>
                <td>{{st.jum[0]}}</td>
                <td>{{st.jum[1]}}</td>
                <td>{{st.jum[2]}}</td>
                <!-- <td>{{st.jum[0]+st.jum[1]+st.jum[2]}}</td> 
                <td>{{(st.jum[0]+st.jum[1]+st.jum[2])/3}}</td>-->
                <!--<td>{{tot}}</td> 컴퓨티드에 정의된 함수를 호출 tot() 불가, tot 로 호출
                <td>{{avg}}</td>-->
                <td>{{st.tot}}</td><!-- studs 로 작업하여 tot를 만들어서 추가할 예정-->
                <td>{{st.avg}}</td>
            </tr>
        </table>

    </div>
</template>
<script setup>
import { ref, reactive, watch} from 'vue';
const arr = reactive([
                {pname:'현빈', jum:[67,68,69]},
                {pname:'원빈', jum:[87,88,89]},
            ])
const pname=ref('')
const kor = ref(0)
const eng = ref(0)
const mat = ref(0)

function addStud(){
    arr.push(
        {
            pname:pname.value,
            jum : [kor.value, eng.value, mat.value]
        }
    )

    // 입력폼 초기화
    pname.value=''
    kor.value=0
    eng.value=0
    mat.value=0
}

watch(arr, newArr=>{

    newArr.forEach(st=>{
        st.tot = st.jum.reduce((a,b)=> a+b,0)
        st.avg = st.tot / st.jum.length
    })
})

</script>