package com.litongjava.shop.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.litongjava.shop.entity.Product;
import com.litongjava.shop.product.dao.ProductDao;
import com.litongjava.shop.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
  @Autowired
  private ProductDao productDao;
  @Override
  public Product findById(Long id) {
    return productDao.findById(id).get();
  }

  @Override
  public List<Product> findAll() {
    return productDao.findAll();
  }

  @Override
  public void save(Product product) {
    productDao.save(product);
  }

  @Override
  public void update(Product product) {
    productDao.save(product);
  }

  @Override
  public void delete(Long id) {
    productDao.deleteById(id);
  }
}
