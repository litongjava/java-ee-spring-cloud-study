package com.billrobot.study.springcloud;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestTemplateConfiguration {
  
  @Bean
  @LoadBalanced
  private RestTemplate restTemplate(){
    return new RestTemplate();
  }
}
