import Vue from 'vue'
import Router from 'vue-router'
import index from '../components/project/xiaodouya/index'
import systems from './systems'
import blog from './blog'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'index',
      component: index,
      redirect: {name: 'Home'},
      children: [
        // 系统主页
        {
          path: 'Home',
          name: 'Home',
          meta: {
            title: '主页'
          },
          component: () => import('../components/project/xiaodouya/index/part/home/Home.vue'),
          redirect: {name: 'welcome'},
          children: [
            {
              name: 'welcome',
              path: 'welcome',
              meta: {
                title: '欢迎主页'
              },
              component: () => import('../components/project/xiaodouya/modules/welcome')
            },
            // 系统管理系统
            systems,
            // 博客管理系统
            blog
          ]
        }
      ]
    }
  ]
})
