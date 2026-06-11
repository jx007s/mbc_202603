
import ExamDetail from '@/views/ExamDetail.vue'
import ExamList from '@/views/ExamList.vue'
import ExamModify from '@/views/ExamModify.vue'
import ExamWrite from '@/views/ExamWrite.vue'
import { createRouter, createWebHistory } from 'vue-router'


const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    { path: '/', name: 'home',  component: ExamList,},
    { path: '/write', name: 'write',  component: ExamWrite,},
    { path: '/detail/:id', name: 'detail',  component: ExamDetail,},
    { path: '/modify/:id', name: 'modify',  component: ExamModify,},

  ],
})

export default router
