function changePageByRouter (routerData) {
  this.$router.push(routerData)
}

export default {
  install (Vue) {
    Vue.prototype.$changePageByRouter = changePageByRouter
  }
}
