package com.billrobot.study.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {
  @Autowired
  private RestTemplate restTemplate;
  @RequestMapping("dc")
  public String dc() {
    String response = restTemplate.getForObject("http://EUREKA-CLIENT"+"/dc", String.class);
    return response;
  }
}
