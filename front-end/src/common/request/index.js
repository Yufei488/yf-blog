// axios
import axios from 'axios'
// import message from 'ant-design-vue/lib/message'
import notify from 'element-ui/packages/notification'
import {address} from '../../config/systemsConfig'

const submitFn = function ({data, url, successCallback, failCallback}) {
  axios.post(`${address}/${url}`, data).then(function (res) {
    if (successCallback !== undefined) {
      successCallback(res)
    }
    if (res.data.code === '0') {
      // message.warn('哦豁!请求出现了一点点问题')
      notify.warning('哦豁!服务器似乎出现了一点点问题.')
    }
  }).catch(res => {
    notify.error('请求不到服务器,回家收衣服吧.😥')
  })
}
export default {
  install (Vue) {
    Vue.prototype.$submit = submitFn
  }
}
