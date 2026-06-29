import Home from '@/views/Home.vue'
import CarNum from '@/views/CarNum.vue'
import { createRouter, createWebHistory } from 'vue-router'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    { path: '/', name: 'home',  component: Home,},
    { path: '/carNum', name: 'carNum',  component: CarNum,},
  ],
})

export default router
