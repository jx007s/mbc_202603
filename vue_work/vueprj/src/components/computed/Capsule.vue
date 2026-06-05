<template>
    <div>
        <h2>캡슐이지</h2>
        <p>asdf:{{asdf}}</p>  <!-- 호출시 asdf의  get() 실행 -->
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
                    this.msg = vv
                }
            }
        },
        data(){
            return {
                msg:'캡슐고고'
            }
        }

    }
</script>