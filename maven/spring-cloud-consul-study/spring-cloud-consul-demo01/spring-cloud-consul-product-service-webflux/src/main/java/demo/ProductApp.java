package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductApp {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(ProductApp.class, args);
    String[] beanDefinitionNames = context.getBeanDefinitionNames();
    for (String string : beanDefinitionNames) {
      System.out.println(string);
    }

  }
}
