package com.litongjava.shop.product;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;

import com.litongjava.hotswap.wrapper.spring.boot.SpringApplicationWrapper;
import com.litongjava.utils.ip.IpUtils;

@SpringBootApplication
@EntityScan("com.litongjava.shop.entity")
public class ProductApplication {
  private static ApplicationContext ctx;
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    ctx = SpringApplicationWrapper.run(ProductApplication.class, args, true);
    info(start);
  }
  private static void info(long start) {
    Environment environment = ctx.getBean(Environment.class);
    String projectName = environment.getProperty("spring.application.name");
    if(StringUtils.isEmpty(projectName)) {
      projectName=ProductApplication.class.getName();
    }
    TomcatServletWebServerFactory tomcatServletWebServerFactory = (TomcatServletWebServerFactory) ctx
        .getBean("tomcatServletWebServerFactory");
    int port = tomcatServletWebServerFactory.getPort();
    String contextPath = tomcatServletWebServerFactory.getContextPath();
    IpUtils.getThisUrl(port, contextPath);
    long end = System.currentTimeMillis();
    System.out.println("启动"+projectName+"共使用了:" + (end - start) + "ms");
  }
}