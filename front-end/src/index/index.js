// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from '../components/project/xiaodouya/index'
// Ant框架
import antDesignVue from 'ant-design-vue'
import 'ant-design-vue/dist/antd.css'
// ElementUI框架
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
// 路由
import router from '../router'
// axios
import axios from 'axios'

Vue.config.productionTip = true

Vue.use(antDesignVue)
Vue.use(ElementUI)
Vue.prototype.$axios = axios
/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
