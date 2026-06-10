import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import User from '@/views/User.vue'
import { dashboardRoutes } from './dashboardRoute.js'
import NoticeHome from '@/views/notice/NoticeHome.vue'
import NoticeList from '@/views/notice/NoticeList.vue'
import NoticeDetail from '@/views/notice/NoticeDetail.vue'
import NoticeWrite from '@/views/notice/NoticeWrite.vue'
import GallHello from '@/views/gall/GallHello.vue'
import NotFFF from '@/views/NotFFF.vue'
import RouterBtnGo from '@/views/RouterBtnGo.vue'


const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView,
    },
    {
      path: '/about',
      name: 'aboutttt',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../views/AboutView.vue'),
    },
    {
      path: '/user/:service/:id',
      name:'user',
      component: User,
    },
    ...dashboardRoutes, // 다른 파일의 route 결합


    //중첩 라우트
    {
      path: '/notice',
      component: NoticeHome,
      children:[    //하위 라우트 -- 중첩하여 라우트 처리
          {path: '',component: NoticeList},     //  path는 상위 라우트에서 연결하여 작성
          {path: 'detail',component: NoticeDetail},
          {path: 'write',component: NoticeWrite},
      ]
    },

    //Alias  :   GallHello 컴포넌트에 '/gall/hello', '/gall/info' 둘다 라우트
    {
      path: '/gall/hello',
      alias:'/gall/info',
      component: GallHello,
    },

    //redirect  :  '/gall/history' -->  '/gall/hello' 로 리다이렉트
    {
      path: '/gall/history',
      redirect: '/gall/hello',
    },

    //router 로 페이지이동
    {
      path: '/btnGo',
      component: RouterBtnGo,
    },


    // 404 처리
    {
      path: '/:pathMatch(.*)*',
      component: NotFFF,
    },
  ],
})

export default router
