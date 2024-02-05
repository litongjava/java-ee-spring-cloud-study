package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

import com.litongjava.jfinal.aop.annotation.AComponentScan;
import com.litongjava.tio.boot.spring.EmbeddedTioBoot;
import com.litongjava.tio.boot.spring.SpringBootArgs;
import com.litongjava.tio.boot.spring.TioBootWebServerFactoryCustomizer;

@SpringBootApplication
@EnableDiscoveryClient
@Import({ EmbeddedTioBoot.class, TioBootWebServerFactoryCustomizer.class })
@AComponentScan
public class ProductApp {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    SpringBootArgs.set(ProductApp.class, args);
    SpringApplication.run(ProductApp.class, args);
    long end = System.currentTimeMillis();
    System.out.println(end - start + ("ms"));
  }
}
