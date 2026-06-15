<script setup>
import { RouterLink, RouterView } from 'vue-router'
import { useJwtStore } from './stores/jwtStore';
const jwtStore = useJwtStore()
</script>

<template>
      <nav>
        <RouterLink to="/">main</RouterLink>
        <RouterLink to="/gall/aa">갤러리</RouterLink>
        <RouterLink to="/order">주문</RouterLink>
        <RouterLink to="/login">로그인</RouterLink>
        <button @click="jwtStore.logoutGo()">로그아웃</button>
      </nav>



  <RouterView />
</template>

<style scoped>
nav {
  width: 100%;
  font-size: 12px;
  text-align: center;
  margin-top: 2rem;
}

nav a.router-link-exact-active {
  color: var(--color-text);
}

nav a.router-link-exact-active:hover {
  background-color: transparent;
}

nav a {
  display: inline-block;
  padding: 0 1rem;
  border-left: 1px solid var(--color-border);
}

nav a:first-of-type {
  border: 0;
}

</style>
