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

I. 설치 
프로젝트 폴더 터미널: npm i vue-router@4

II.개념 

1. router.js : 라우트 정보 설정
  1.1  routes : 경로와 components 매칭
    routes: [
                { path: '/', component: HomeView},
                { path: '/about',component: AboutView.vue}
            ]
  1.2  routes 정보를 router에 설정하여 생성
    const router = createRouter({
        history: createWebHistory(import.meta.env.BASE_URL),  //이전페이지로 이동 가능토록 페이지기록
        routes  // 위의 routes를 사용
    })

2. main.js : 라우트 정보 애플리케이션의 미들웨어로 등록
    import router from './router/index.js'
    //라우터 등록
    app.use(router)

3. App.vue : router 의 화면 위치 설정
  <router-view></router-view>

4. 경로이동
  <router-link to="/">home으로</router-link>


III. 동작구조
main.js
  |
  V
router/index.js
  |
  V
라우터 설정
  |
  V
App.vue
  |
  V
router-view
  |
  V
현재 URL 컴포넌트 렌더링

useRoute() : 현재 route 정보




----------------------------------------------------
    top
----------------------------------------------------
      |
menu  |        main
      |
      |
----------------------------------------------------
    bottom
----------------------------------------------------



빵집

top :      info        일반빵      케이크       
-------------------------------------------------
menu
        hello         바게뜨      치즈
        history         앙꼬      생크림
        location      소보르     쉬폰



-->
