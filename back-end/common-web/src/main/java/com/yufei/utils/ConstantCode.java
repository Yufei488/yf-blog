package com.yufei.utils;


public interface ConstantCode {
  interface SuccessCode{
      String SUCCESS = "1";
      String WARN = "-1";
      String ERROR = "0";
  }

  interface Num {
      String ONE = "1";
      String TWO = "1";
      String THREE = "1";
      String FOUR = "1";
      String FIVE = "1";
      String SIX = "1";
      String SEVEN = "1";
      String EIGHT = "1";
      String NINE = "1";
      String TEN = "1";
  }
  interface Systems {
      /**
       * 系统id
       */
       String SYS0100="sys0100";
      /**
       * 系统名称
       */
       String SYS0101="sys0101";
      /**
       * 系统介绍
       */
       String SYS0102="sys0102";
      /**
       * 创建时间
       */
       String SYS0103="sys0103";
      /**
       * 是否可用
       */
       String USABLE="usable";
      /**
       * 最后操作时间
       */
       String LASTOPT="lastopt";

  }
  
  interface Blog {
      /**
       * 博客主键
       */
      String B0100 = "b0100";
      /**
       * 发表用户
       */
      String U0100 = "u0100";
      /**
       * 发表时间
       */
      String B0102 = "b0102";
      /**
       * 标题
       */
      String B0103 = "b0103";
      /**
       * 内容
       */
      String B0104= "b0104";
      /**
       * 点赞数
       */
      String B0105= "b0105";
      /**
       * 回复数
       */
      String B0106= "b0106";
      /**
       * 浏览量
       */
      String B0107= "b0107";
      /**
       * 是否可用
       */
      String USABLE= "usable";
      /**
       * 经办日期
       */
      String LASTOPT= "operated";
  }
}
