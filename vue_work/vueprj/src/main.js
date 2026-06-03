import './assets/main.css'

import { createApp } from 'vue'
import { createPinia } from 'pinia'

import App from './App1.vue'
import router from './router'

const app = createApp(App)

app.use(createPinia())
app.use(router)

app.mount('#app')

/// myprj  -->  안녕하세요 제 이름은 장동건 입니다.
