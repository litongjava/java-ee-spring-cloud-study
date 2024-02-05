package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.litongjava.jfinal.spring.SpringBeanContextUtils;
import com.litongjava.tio.http.server.annotation.RequestPath;

import demo.service.UserService;
import lombok.extern.slf4j.Slf4j;

@RequestPath("/consumer")
@Slf4j
public class OrderController {

  // consul服务中心的服务名称
  public static final String INVOKE_URL = "http://consul-provider-product";

  @Autowired
  RestTemplate restTemplate;

  public String getRestTemplate() {
    return restTemplate.toString();
  }

  @RequestPath(value = "/payment/consul")
  public String paymentInfo() {
    log.info("restTemplate:{}", restTemplate.toString());
    String result = restTemplate.getForObject(INVOKE_URL + "/product/consul", String.class);
    return result;
  }
}
