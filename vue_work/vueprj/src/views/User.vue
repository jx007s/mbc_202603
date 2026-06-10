<template>
  <div>
    <h1>User</h1>
  </div>
</template>


<script setup>
import { useRoute } from 'vue-router';
const route = useRoute()        //현재 라우트 정보  -- /about?page=2&cate=gall#pp2
//console.log(route)
console.log("path",route.path)              //  /about
console.log("fullPath",route.fullPath)      //  /about?page=2&cate=gall#pp2
console.log("name",route.name)              //  about
console.log("params",route.params)
console.log("query",route.query)            //  {page: '2', cate: 'gall'}
console.log("hash",route.hash)              //  #pp2
console.log("meta",route.meta)
console.log("matched",route.matched)
console.log("redirectedFrom",route.redirectedFrom)
</script>

