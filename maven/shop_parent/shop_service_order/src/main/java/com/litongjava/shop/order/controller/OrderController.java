package com.litongjava.shop.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.litongjava.shop.entity.Order;
import com.litongjava.shop.entity.Product;
import com.litongjava.shop.order.service.OrderService;

@RestController
@RequestMapping("order")
public class OrderController {

  @Autowired
  private OrderService orderService;
  @Autowired
  private RestTemplate restTemplate;

  @GetMapping
  public List<Order> findAll() {
    return orderService.findAll();
  }

  @GetMapping("/{id}")
  public Order findById(@PathVariable Long id) {
    return orderService.findById(id);
  }

  @PostMapping
  public String save(@RequestBody Order e) {
    orderService.save(e);
    return "保存成功";
  }

  @PutMapping
  public String update(@RequestBody Order e) {
    orderService.update(e);
    return "修改成功";
  }

  @DeleteMapping
  public String delete(Long id) {
    orderService.delete(id);
    return "删除成功";
  }

  @PostMapping("/{id}")
  public String order(Integer num) {
    //通过restTemplate调用商品微服务
    Product e =restTemplate.getForObject("http://127.0.0.1:9002/product/1", Product.class);
    System.out.println(e);
    return "操作成功";
  }
}
