<template>
  <h2>登记患者信息</h2>
  姓名：<input type="text" width="80px" v-model="pname1">
  <button @click="addPatient">注册</button>
  <h3>{{ infomation }}</h3>
  <hr>
  <h2>查询患者信息</h2>
  患者ID：<input type="text" width="80px" v-model="pID">
  <button @click="findNameByID">查询</button>
  <h3>患者姓名为{{ pname2 }}</h3>
</template>

<script>
  import axios from 'axios';
  import { ref } from 'vue';
  export default {
    name:'MyDemo',
    setup(){
      let pname1 = ref('')
      let pname2 = ref('')
      let pID = ref()
      let infomation = ref('')
      function addPatient(){
        axios.get('http://localhost:8080/addPatient', {params:{
            pname:pname1.value
        }}).then(()=>{
            infomation.value = '注册成功！'
        }).catch(()=>{
            infomation.value = '注册失败！'
        })
      }
      function findNameByID(){
        axios.get('http://localhost:8080/showPatient', {params:{
            pid:pID.value
        }}).then(res=>{
            pname2.value = res.data
        }).catch(err=>{
            console.log(err)
        })
      }
      return {
        pname1, 
        pname2,
        pID,
        infomation,
        findNameByID,
        addPatient
      }
    }
  }
</script>