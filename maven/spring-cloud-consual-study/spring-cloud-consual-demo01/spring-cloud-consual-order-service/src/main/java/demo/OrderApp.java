package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by litonglinux@qq.com on 1/8/2024_2:55 PM
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderApp {
  public static void main(String[] args) {
    SpringApplication.run(OrderApp.class, args);
  }

}
