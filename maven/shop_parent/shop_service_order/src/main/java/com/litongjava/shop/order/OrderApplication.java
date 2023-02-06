package com.litongjava.shop.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com.litongjava.shop.order")
@EntityScan("com.litongjava.shop.entity")
public class OrderApplication {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    SpringApplication.run(OrderApplication.class, args);
    long end = System.currentTimeMillis();
    System.out.println((end - start) + "ms");
  }

  //配置RestTemplate交给spring管理
  @Bean
  public RestTemplate getRestTemplate() {
    return new RestTemplate();
  }
}
