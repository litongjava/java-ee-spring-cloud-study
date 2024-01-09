package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.litongjava.jfinal.aop.annotation.AComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@AComponentScan
public class ProductApp {

  public static void main(String[] args) {
    SpringApplication.run(ProductApp.class, args);
  }
}
