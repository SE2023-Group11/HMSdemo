import axios from 'axios'
export function request(config){
    axios.defaults.baseURL='http://localhost:8080'
    axios(config.url).then(res=>{
        config.success(res)
    }).catch(err=>{
        config.fail(err)
    })
}