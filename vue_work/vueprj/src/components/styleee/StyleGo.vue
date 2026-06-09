<template>
    <div>
        <h2>스타일</h2>
        <div style="color:#f00; font-size: 12px;">
            일반적인 글씨지
        </div>
        <div :style="{color:cc1, 'font-size': ff1+'px'}">
            인라인 스타일
        </div>
        <div :class="{aaa:isA, bbb: isB}">
            클래스 스타일
        </div>
        <div :style="sty1">
            변수 스타일
        </div>
        <div :style="[sty2, sty3]">
            배열 변수 스타일 - 스타일이 중복되는 경우 마지막 선언된 스타일로 적용
        </div>
        <div :class="is3 ? 'ccc' : 'ddd'">
            삼항 연산 스타일
        </div>
        <div :class="sty4">
            객체 기반 클래스 스타일
        </div>
        <div>
            취미 : <input v-model="is4" type="checkbox"> 독서
        </div>
        <div>
            글자크기 : <input v-model.number="ff2" type="number">
            <p :style="{fontSize:ff2+'px'}">아기상어 1234 asdf</p>
        </div>
        <div class="eee">
            임포트 스타일1
        </div>
        <div class="fff">
            임포트 스타일2
        </div>
        <!--public 절대경로-->
        <img src="/asdf/qwer.jpeg" alt="">

        <!--src/assets 변수형태 -->
        <img :src="er" alt="">
        <img :src="ty" alt="">
        <StyleChildGo/>
    </div>
</template>
<!--  전역 스타일로 사용된다 -->
<style>
    img{
        width: 200px;
    }
    .aaa{  
        background:#ff0
    }
    .bbb{
        font-style: italic;
    }
</style>

<!--  지역 스타일로 사용된다
::v-deep( 선택자 )  자식컴포넌트에도 스타일 적용가능 --자식의 자식 까지 사용가능
-->
<style scoped>    
    .ccc{
        background:#0f0
    }
    ::v-deep(.ddd){   
        background:#f0f
    }
</style>

<script setup>
import { ref } from 'vue';
import StyleChildGo from './StyleChildGo.vue';

// 이미지,css 파일 임포트
import '@/assets/zxcv/myCss.css'
import er from '@/assets/zxcv/eerr.jpg'


const cc1 = ref('#00f')
const ff1 = ref(12)
const isA = false
const isB = true
const sty1 = {    color:"#080", backgroundColor:"#0ff" }
const sty2 = {    color:"#f00", fontStyle:'italic' }
const sty3 = {    color:"#00f", backgroundColor:"#0ff" } 
const is3 = false
const sty4 = {    aaa:true, bbb:false} // 클래스에 대한 적용여부 지정 
                        // 클래스명 : true/false
const is4 = ref(true)
const ff2 = ref(12)
/*
스타일 적용
1. 일반적인 text  방식
2. :style, :class  를 이용한 vue 변수 적용
3. 스타일 적용시 변수와 키배열 형태를 사용하여 적용
4. style scoped : 컴포넌트 단위로 css 제한시 사용
                template 내부요소에만 css가 적용
                DOM 요소에 data-v-????? 로 css 범위 제한, 하위 컴포넌트에도 전달하지 않음
                ::v-deep( 선택자 )  자식컴포넌트에도 스타일 적용가능 --자식의 자식 까지 사용가능

이미지/스타일 가져오기
public 폴더 - 절대경로로 인식하여 접근  src="/asdf/qwer.jpeg"

src/assets 폴더 - script 구간에서 import 처리


프로젝트
|-public
|    └asdf
|       └qwer.jpeg
|-src
    └assets
        └zxcv
            |-eerr.jpg
            |-ttyy.jpg
*/
</script>