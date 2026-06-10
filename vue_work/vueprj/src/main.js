import { createApp } from 'vue'
import { createPinia } from 'pinia'
import App from './App.vue'
import router from './router/index.js'


const app = createApp(App)

//Pinia 미들웨어로 등록
app.use(createPinia())

//라우터 등록
app.use(router)

app.mount('#app')
