package com.litongjava.shop.product.controller;

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

import com.litongjava.shop.entity.Product;
import com.litongjava.shop.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
  @Autowired
  private ProductService productService;
  @GetMapping
  public List<Product> findAll() {
    return productService.findAll();
  }
  @GetMapping("/{id}")
  public Product findById(@PathVariable Long id) {
    return productService.findById(id);
  }
  @PostMapping
  public String save(@RequestBody Product product) {
    productService.save(product);
    return "保存成功";
  }
  @PutMapping("/{id}")
  public String update(@RequestBody Product product) {
    productService.update(product);
    return "修改成功";
  }
  @DeleteMapping("/{id}")
  public String delete(Long id) {
    productService.delete(id);
    return "删除成功";
  }
}
