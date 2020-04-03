import modules from '../../config/systemsConfig'
let systems = modules.systems
let systemManager = systems.children.systemManager
export default {
  path: systems.name,
  name: systems.name,
  meta: {
    title: systems.meta.title
  },
  component: () => import('../../components/project/xiaodouya/modules/systems'),
  children: [
    // 系统管理系统
    {
      name: systemManager.name,
      path: systemManager.name,
      meta: {
        title: systemManager.meta.title
      },
      component: () => import('../../components/project/xiaodouya/modules/systems/systemManager/SystemManager')
    }
  ]
}
