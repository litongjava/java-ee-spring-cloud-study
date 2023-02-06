package com.litongjava.shop.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.litongjava.utils.json.JacksonUtils;

import lombok.extern.slf4j.Slf4j;


/**
 * @author create by ping-e-lee on 2021年7月12日 下午10:12:13 
 * @version 1.0 
 * @desc
 */
@RestController
@RequestMapping("discoveryClient")
@Slf4j
public class DiscoveryClientContorller {
  @Autowired
  private DiscoveryClient discoveryClient;

  @RequestMapping("getInstances")
  public List<String> getInstances() {
    // 根据微服务名称从注册中心获取相关的元数据信息
    List<String> services = discoveryClient.getServices();
    log.info("services:{}",services);
    return services;
    
  }
  @RequestMapping("getInstancesById")
  public List<ServiceInstance> getInstances(String serviceId){
    List<ServiceInstance> instances = discoveryClient.getInstances(serviceId);
    //转为json格式
    String json = JacksonUtils.toJson(instances);
    log.info("json:{}",json);
    return instances;
  }
}
