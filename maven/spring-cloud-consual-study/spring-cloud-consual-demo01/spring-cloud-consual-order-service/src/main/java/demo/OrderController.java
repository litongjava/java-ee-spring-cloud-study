package demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("consumer")
public class OrderController {

  // consul服务中心的服务名称
  public static final String INVOKE_URL = "http://consul-provider-product";

  @Resource
  private RestTemplate restTemplate;

  @GetMapping(value = "/payment/consul")
  public String paymentInfo() {
    String result = restTemplate.getForObject(INVOKE_URL + "/product/consul", String.class);
    return result;
  }
}
