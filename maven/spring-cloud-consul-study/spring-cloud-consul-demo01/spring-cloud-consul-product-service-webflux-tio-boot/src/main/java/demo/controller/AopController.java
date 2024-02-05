package demo.controller;

import com.litongjava.jfinal.spring.SpringBeanContextUtils;
import com.litongjava.tio.http.server.annotation.RequestPath;

@RequestPath("/aop")
public class AopController {

  public String[] beans() {
    String[] beanDefinitionNames = null;
    try {
      beanDefinitionNames = SpringBeanContextUtils.getBeanDefinitionNames();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return beanDefinitionNames;
  }
}
