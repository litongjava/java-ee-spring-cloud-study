package com.litongjava.shop.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.litongjava.shop.entity")
public class UserApplication {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    SpringApplication.run(UserApplication.class,args);
//    SpringApplicationWrapper.run(UserApplication.class, args, true);
    long end = System.currentTimeMillis();
    System.out.println((end-start)+"ms");
  }
}
