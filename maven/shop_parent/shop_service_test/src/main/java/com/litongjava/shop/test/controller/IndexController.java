package com.litongjava.shop.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author create by ping-e-lee on 2021年7月13日 下午1:06:04 
 * @version 1.0 
 * @desc
 */
@RestController
@RequestMapping("")
public class IndexController {
  @RequestMapping
  public String index() {
    return "shop-service-test";
  }
}
