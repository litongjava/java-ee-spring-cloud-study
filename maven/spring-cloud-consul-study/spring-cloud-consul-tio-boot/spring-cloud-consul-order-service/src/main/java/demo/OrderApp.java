package demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

import com.litongjava.hotswap.wrapper.spring.boot.SpringApplicationWrapper;
import com.litongjava.jfinal.aop.annotation.AComponentScan;
import com.litongjava.tio.boot.spring.SpringBootArgs;
import com.litongjava.tio.boot.spring.TioBootServerAutoConfiguration;

@SpringBootApplication
@EnableDiscoveryClient
@AComponentScan
@Import({ TioBootServerAutoConfiguration.class })
public class OrderApp {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    SpringBootArgs.set(OrderApp.class, args);
    SpringApplicationWrapper.run(OrderApp.class, args);
    long end = System.currentTimeMillis();
    System.out.println(end - start + "(ms)");
  }

}
