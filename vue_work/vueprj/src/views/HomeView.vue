<script setup>

</script>

<template>
  <main>
    <h1>홈이여</h1>
    <router-link to="/about">about으로</router-link>
  </main>
</template>
<!--
Vue : SPA (Single Page Application - 1개의 페이지로 구현)
      기능에 따른 페이지 변환 및 URL 페이지 이동이 필요 ==> Vue Router
Vue Router - 공식 라이브러리

1. 설치 
프로젝트 폴더 터미널: npm i vue-router@4

개념 
1. router.js : 라우트 정보 설정
  1.1  routes : 경로와 components 매칭
    routes: [
                { path: '/', component: HomeView},
                { path: '/about',component: AboutView.vue}
            ]
  1.2  routes 정보를 router에 설정하여 생성
    const router = createRouter({
        history: createWebHistory(import.meta.env.BASE_URL),
        routes  // 위의 routes를 사용
    })










-->
