package demo;

import com.litongjava.tio.http.server.annotation.RequestPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@RestController
@Component
//@RequestMapping("consumer")
@RequestPath("/consumer")
public class OrderController {

  public OrderController() {
    System.out.println("hello");
  }

  // consul服务中心的服务名称
  public static final String INVOKE_URL = "http://consul-provider-product";
  

  @RequestPath(value = "/payment/consul")
  public String paymentInfo() {
    RestTemplate restTemplate = SpringContextUtils.getBean(RestTemplate.class);
    String result = restTemplate.getForObject(INVOKE_URL + "/product/consul", String.class);
    return result;
  }

}
