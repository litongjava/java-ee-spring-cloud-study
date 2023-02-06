package com.litongjava.shop.order.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.litongjava.shop.entity.Order;
import com.litongjava.shop.order.dao.OrderDao;
import com.litongjava.shop.order.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {

  @Autowired
  private OrderDao orderDao;
  @Override
  public Order findById(Long id) {
    return orderDao.findById(id).get();
  }

  @Override
  public List<Order> findAll() {
    return orderDao.findAll();
  }

  @Override
  public void save(Order e) {
    orderDao.save(e);
  }

  @Override
  public void update(Order e) {
    orderDao.save(e);
  }

  @Override
  public void delete(Long id) {
    orderDao.deleteById(id);
  }
}
