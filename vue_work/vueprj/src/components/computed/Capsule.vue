<template>
    <div>
        <h2>캡슐이지</h2>
        <p>msg:{{msg}}</p>
        <p>asdf:{{asdf}}</p>  <!-- 호출시 asdf의  get() 실행 -->
        <button @click="asdfChange">asdf변경</button>
        <br/>
        <input type="text" v-model="zxcv">
    </div>
</template>
<script>
    export default {
        computed:{

            asdf:{   //캡슐화 getter, setter 메소드화
                get(){
                    console.log(" asdf get() 실행")
                    return this.msg
                },
                set(vv){
                    console.log(` asdf set() 실행 ${vv}`)
                    this.msg = vv
                }
            },
            zxcv:{      //v-model="zxcv" - input 과 연결하여 사용
                get(){
                    return this.msg
                },
                set(vv){
                    this.msg = vv
                }
            }
        },
        methods:{
            asdfChange(){
                this.asdf = "변신"
            }
        },
        data(){
            return {
                msg:'캡슐고고'
            }
        }

    }
</script>