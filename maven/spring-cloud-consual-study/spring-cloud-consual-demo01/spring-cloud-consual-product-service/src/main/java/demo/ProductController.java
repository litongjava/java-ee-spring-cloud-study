package demo;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Slf4j //日志
public class ProductController {
  @Value("${server.port}")
  private String serverPort;

  @RequestMapping(value = "/product/consul")
  public String paymentConsul() {
    return "springCloud with consul: " + serverPort + "\t" + UUID.randomUUID().toString();
  }
}
