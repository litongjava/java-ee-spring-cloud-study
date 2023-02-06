package com.litongjava.shop.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import com.litongjava.hotswap.wrapper.spring.boot.SpringApplicationWrapper;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    //SpringApplication.run(EurekaServerApplication.class, args);
    SpringApplicationWrapper.run(EurekaServerApplication.class, args, true);
    long end = System.currentTimeMillis();
    System.out.println((end-start)+"ms");
  }
}