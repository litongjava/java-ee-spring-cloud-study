package com.litongjava.shop.product.service;

import java.util.List;

import com.litongjava.shop.entity.Product;

public interface ProductService {
  //根据id查询
  Product findById(Long id);
  //查询全部
  List<Product> findAll();
  //保存
  void save(Product product);
  //更新
  void update(Product product);
  //删除
  void delete(Long id);
}
