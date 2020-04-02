<!--
author: YuFei
createDate: 2020/3/28
description: 管理系统主页
-->
<template>
  <!--整体布局-->
  <a-layout id="components-layout-demo-top-side">
    <a-layout-header class="index-header">
      <div class="index-header-logo">
        <span>小豆芽管理系统</span>
      </div>
      <a-menu
        theme="dark"
        mode="horizontal"
        :defaultSelectedKeys="['1']"
        style="line-height: 64px"
      >
        <a-menu-item key="0">系统管理</a-menu-item>
        <a-menu-item v-for="system in systemsList" :key="system.sys0100" >
          <span v-text="system.sys0101"/>
        </a-menu-item>
      </a-menu>
    </a-layout-header>
    <a-layout-content class="index-content">
      <a-breadcrumb class="index-content-bread">
        <a-breadcrumb-item>Home</a-breadcrumb-item>
        <a-breadcrumb-item>List</a-breadcrumb-item>
        <a-breadcrumb-item>App</a-breadcrumb-item>
      </a-breadcrumb>
      <a-layout class="index-content-layout">
        <a-layout-sider class="index-content-layout-sidebar">
          <a-menu
            class="index-content-layout-sidebar-menu"
            mode="inline"
            :defaultSelectedKeys="['1']"
            :defaultOpenKeys="['sub1']"
          >
            <a-sub-menu key="sub1">
              <span slot="title"><a-icon type="user"/>subnav 1</span>
              <a-menu-item key="1">option1</a-menu-item>
              <a-menu-item key="2">option2</a-menu-item>
              <a-menu-item key="3">option3</a-menu-item>
              <a-menu-item key="4">option4</a-menu-item>
            </a-sub-menu>
            <a-sub-menu key="sub2">
              <span slot="title"><a-icon type="laptop"/>subnav 2</span>
              <a-menu-item key="5">option5</a-menu-item>
              <a-menu-item key="6">option6</a-menu-item>
              <a-menu-item key="7">option7</a-menu-item>
              <a-menu-item key="8">option8</a-menu-item>
            </a-sub-menu>
            <a-sub-menu key="sub3">
              <span slot="title"><a-icon type="notification"/>subnav 3</span>
              <a-menu-item key="9">option9</a-menu-item>
              <a-menu-item key="10">option10</a-menu-item>
              <a-menu-item key="11">option11</a-menu-item>
              <a-menu-item key="12">option12</a-menu-item>
            </a-sub-menu>
          </a-menu>
        </a-layout-sider>
        <a-layout-content class="index-content-layout-childPage">
          content
        </a-layout-content>
      </a-layout>
    </a-layout-content>
    <a-layout-footer class="index-footer">
      小豆芽管理系统 ©2020/4/1 Created by Yufei
    </a-layout-footer>
  </a-layout>
</template>

<script>
export default {
  name: 'BlogHome',
  data () {
    return {
      systemsList: null
    }
  },
  methods: {
    getSystems () {
      this.$axios.post('http://127.0.0.1:8011/systems/querySystemList').then(res => {
        this.systemsList = res.data.data
      }).catch(res => {
        this.$message.error('请求出错了!')
      })
    }
  },
  created () {
    this.getSystems()
  }
}
</script>

<style scoped lang="less">
  .ant-layout-header {
    line-height: 30px;
  }

  .index-header, .index-content, .index-footer {
    position: absolute;
    width: 100%;
    min-width: 1024px;
  }

  @header-height: 64px;
  .index-header {
    height: @header-height;

    &-logo {
      width: 120px;
      height: 31px;
      background: rgba(255, 255, 255, 0);
      position: relative;
      top: 50%;
      transform: translateY(-50%);
      float: left;
      text-align: center;

      span {
        margin: 0;
        line-height: 20px;
        position: relative;
        color: #ffffff;
        top: 0
      }
    }
  }

  .index-content {
    height: 80%;
    padding: 0 50px;
    top: @header-height;

    &-bread {
      margin: 16px 0
    }

    &-layout {
      padding: 24px 0;
      background: #fff;
      height: 100%;

      &-sidebar {
        &-menu {
          height: 100%
        }
      }

      &-childPage {
        background: #eeeeee;
        padding: 0 24px;
        min-height: 280px;
      }
    }
  }

  .index-footer {
    text-align: center;
    bottom: 0
  }
</style>
