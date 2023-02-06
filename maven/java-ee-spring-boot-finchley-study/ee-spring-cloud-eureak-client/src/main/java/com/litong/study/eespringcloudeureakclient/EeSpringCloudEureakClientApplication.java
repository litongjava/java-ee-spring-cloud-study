package com.litong.study.eespringcloudeureakclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EeSpringCloudEureakClientApplication {
  public static void main(String[] args) {
    SpringApplication.run(EeSpringCloudEureakClientApplication.class, args);
  }
}
