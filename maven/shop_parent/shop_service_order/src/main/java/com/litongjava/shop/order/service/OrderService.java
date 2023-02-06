package com.litongjava.shop.order.service;

import java.util.List;

import com.litongjava.shop.entity.Order;

public interface OrderService {
  //根据id查询
  Order findById(Long id);
  //查询全部
  List<Order> findAll();
  //保存
  void save(Order e);
  //更新
  void update(Order e);
  //删除
  void delete(Long id);
}
