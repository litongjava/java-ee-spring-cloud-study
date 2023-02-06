package com.litongjava.shop.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.litongjava.shop.entity.Product;

public interface ProductDao extends JpaRepository<Product,Long>, JpaSpecificationExecutor<Product> {}