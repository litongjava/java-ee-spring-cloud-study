package com.litong.study.eespringcloudeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EeSpringCloudEurekaServerApplication {
  public static void main(String[] args) {
    SpringApplication.run(EeSpringCloudEurekaServerApplication.class, args);
  }
}
