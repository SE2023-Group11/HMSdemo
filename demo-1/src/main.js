import { createApp } from 'vue';
import App from './App.vue';

createApp(App).mount('#app')

import { request } from './network/request/request'
request({
    url:'getPatients',
    success:res=>{
        console.log(res)
    },
    fail:err=>{
        console.log(err)
    }
})