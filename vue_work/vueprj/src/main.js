import { createApp } from 'vue'
import { createPinia } from 'pinia'
import App from './App.vue'


const app = createApp(App)

//Pinia 미들웨어로 등록
app.use(createPinia())

app.mount('#app')
