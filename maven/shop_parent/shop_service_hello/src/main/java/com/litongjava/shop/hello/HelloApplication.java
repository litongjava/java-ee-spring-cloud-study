package com.litongjava.shop.hello;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.litongjava.hotswap.wrapper.spring.boot.SpringApplicationWrapper;

/**
 * @author create by ping-e-lee on 2021年6月25日 下午2:43:47 
 * @version 1.0 
 * @desc
 */
@SpringBootApplication
public class HelloApplication {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    //SpringApplication.run(Application.class, args);
    SpringApplicationWrapper.run(HelloApplication.class, args, true,true);
    long end = System.currentTimeMillis();
    System.out.println((end-start)+"ms");
  }
}
