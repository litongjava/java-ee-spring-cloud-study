package com.litongjava.shop.product.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author create by ping-e-lee on 2021年7月13日 上午11:24:21 
 * @version 1.0 
 * @desc
 */
@RequestMapping
@RestController
public class IndexController {

  @RequestMapping
  public String index() {
    return "shop_service_product";
  }
}
