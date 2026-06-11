import ExamDetail from '@/views/ExamDetail.vue'
import ExamList from '@/views/ExamList.vue'
import ExamWrite from '@/views/ExamWrite.vue'
import { createRouter, createWebHistory } from 'vue-router'


const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    { path: '/', name: 'home',  component: ExamList,},
    { path: '/write', name: 'write',  component: ExamWrite,},
    { path: '/detail/:id', name: 'detail',  component: ExamDetail,},
  ],
})

export default router
