import Vue from 'vue'
import Router from 'vue-router'
import index from '../components/project/xiaodouya/index'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'index',
      component: index,
      redirect: {name: 'blogHome'},
      children: [
        // 博客管理系统
        {
          path: 'blogHome',
          name: 'blogHome',
          component: () => import('../components/project/xiaodouya/index/part/home/BlogHome'),
          children: [
            // 其它
          ]
        }
        // 其它系统
      ]
    }
  ]
})
