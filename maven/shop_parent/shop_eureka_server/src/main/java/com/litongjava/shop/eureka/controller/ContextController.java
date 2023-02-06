package com.litongjava.shop.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author create by ping-e-lee on 2021年7月13日 下午4:00:43 
 * @version 1.0 
 * @desc
 */
@RestController
@RequestMapping("context")
public class ContextController {
  @Autowired
  private ApplicationContext ac;
  
  @RequestMapping("getProperty")
  public String getProperty(String key) {
    Environment environment = ac.getBean(Environment.class);
    return environment.getProperty(key);
  }
  
  @RequestMapping("getBeanDefinitionNames")
  public String[] getBeanDefinitionNames() {
    return(ac.getBeanDefinitionNames());
  }
}
