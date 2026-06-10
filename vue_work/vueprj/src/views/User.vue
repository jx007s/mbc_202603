<template>
  <div>
    <h1>User</h1>
  </div>
</template>


<script setup>
import { useRoute } from 'vue-router';
/*
라우트
{
      path: '/user/:service/:id',
      component: User,
}
*/
const route = useRoute()  //현재 라우트 정보  -- /user/detail/10?page=2&cate=gall#pp2
//console.log(route)
console.log("path",route.path)              //  /user/detail/10
console.log("fullPath",route.fullPath)      //  /user/detail/10?page=2&cate=gall#pp2
console.log("name",route.name)              //  undefined  -- 이름지정안함
console.log("params",route.params)          //  {service: 'detail', id: '10'}
                                            //:service/:id  --> 동적routing의 변수

console.log("query",route.query)            //  {page: '2', cate: 'gall'}
console.log("hash",route.hash)              //  #pp2
console.log("meta",route.meta)
console.log("matched",route.matched)
console.log("redirectedFrom",route.redirectedFrom)
</script>


