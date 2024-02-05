package demo.controller;

import java.util.UUID;

import com.litongjava.tio.http.server.annotation.RequestPath;

//@RestController
//@Slf4j //日志
@RequestPath
public class ProductController {

  // @RequestMapping(value = "/product/consul")
  @RequestPath("/product/consul")
  public String paymentConsul() {
    return "tio-boot with consul: " + UUID.randomUUID().toString();
  }
  
  
}
