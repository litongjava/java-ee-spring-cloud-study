package com.billrobot.study.springcloud.product.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("parameter")
public class ParameterController {

  @RequestMapping("receiveArray")
  public List<Integer> receiveArray(List<Integer> ids) {
    return ids;
  }
}
