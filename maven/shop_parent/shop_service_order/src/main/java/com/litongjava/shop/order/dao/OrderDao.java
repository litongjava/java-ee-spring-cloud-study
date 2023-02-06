package com.litongjava.shop.order.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.litongjava.shop.entity.Order;

public interface OrderDao extends JpaRepository<Order,Long>, JpaSpecificationExecutor<Order> {}
