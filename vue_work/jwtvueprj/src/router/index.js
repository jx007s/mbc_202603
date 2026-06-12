import GallView from '@/views/GallView.vue'
import LoginView from '@/views/LoginView.vue'
import MainView from '@/views/MainView.vue'
import OrderView from '@/views/OrderView.vue'
import { createRouter, createWebHistory } from 'vue-router'


const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    { path: '/login', name: 'login', component: LoginView,  },
    { path: '/gall/:service', name: 'gall', component: GallView,  },
    { path: '/order', name: 'order', component: OrderView,  },
    { path: '/', name: 'main', component: MainView,  },
    
  ],
})

export default router
