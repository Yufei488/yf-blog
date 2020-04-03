import modules from '../../config/systemsConfig'
let blog = modules.blog
export default {
  path: blog.name,
  name: blog.name,
  meta: {
    title: blog.meta.title
  },
  component: () => import('../../components/project/xiaodouya/index/part/home/Home'),
  children: [
    // 其它
  ]
}
