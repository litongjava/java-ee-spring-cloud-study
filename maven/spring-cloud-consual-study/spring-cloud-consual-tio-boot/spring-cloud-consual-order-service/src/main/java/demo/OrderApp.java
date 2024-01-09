package demo;

import com.litongjava.jfinal.aop.annotation.AComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

/**
 * Created by litonglinux@qq.com on 1/8/2024_2:55 PM
 */
@SpringBootApplication
@EnableDiscoveryClient
@AComponentScan
@Import(SpringContextUtils.class)
public class OrderApp {
  public static void main(String[] args) {
    SpringApplication.run(OrderApp.class, args);
  }

}
