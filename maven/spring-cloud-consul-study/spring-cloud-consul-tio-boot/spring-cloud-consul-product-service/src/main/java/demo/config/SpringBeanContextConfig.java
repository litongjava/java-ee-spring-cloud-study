package demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import com.litongjava.jfinal.aop.Aop;
import com.litongjava.jfinal.aop.AopManager;
import com.litongjava.jfinal.spring.SpringBeanContextUtils;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class SpringBeanContextConfig {

  @Autowired
  private ApplicationContext applicationContext;

  @Bean(destroyMethod = "close")
  @DependsOn("restTemplate")
  public void myBean() {
    log.info("add Autowired");
    // 开启和spring的整合
    AopManager.me().getAopFactory().setEnableWithSpring(true);
    SpringBeanContextUtils.setContext(applicationContext);
    // 让 tio-boot的bean支持Autowired注解
    Aop.addFetchBeanAnnotation(Autowired.class);
  }
}
