// localAddress
const address = 'http://127.0.0.1:8011'
const modules = {
  systems: {
    name: 'systems',
    meta: {
      title: '系统管理'
    },
    children: {
      systemManager: {
        name: 'systemManager',
        meta: {
          title: '系统管理'
        }
      }
    }
  },
  blog: {
    name: 'blog',
    meta: {
      title: '博客管理'
    },
    children: {}
  }
}
export {
  address
}
export default modules
