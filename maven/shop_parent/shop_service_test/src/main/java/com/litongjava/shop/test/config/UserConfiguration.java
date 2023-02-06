package com.litongjava.shop.test.config;

import org.springframework.context.annotation.Bean;

import com.litongjava.shop.test.bean.User;

//定义一个configuration ,注意这里并没有使用spring注解,spring扫描的时候并不会装载该类
public class UserConfiguration {
  @Bean
  public User getUser() {
    return new User("张三", 18);
  }
}