// Ant框架
import antDesignVue from 'ant-design-vue'
import 'ant-design-vue/dist/antd.css'
// ElementUI框架
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
// 请求
import request from '../request/index'
// 改变路由
import changePageByRouter from '../lib/router/changPage'
export default {
  install (Vue) {
    Vue.use(antDesignVue)
    Vue.use(ElementUI)
    Vue.use(request)
    Vue.use(changePageByRouter)
  }
}
