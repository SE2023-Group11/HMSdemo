<template>
  <h2>登记患者信息</h2>
  <el-form :model="ruleForm.name" :rules="rules" ref="ruleForm" label-width="100px">
    <el-form-item label="活动名称" prop="name">
      <el-input v-model="ruleForm.name"></el-input>
    </el-form-item>
  </el-form>
</template>

<script>
  export default {
    name:'MyDemo',
    setup(){
    }
  }
</script>