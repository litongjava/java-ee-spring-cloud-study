package com.billrobot.study.springcloud.product.repository;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.billrobot.study.springcloud.product.entity.ProductCategory;


public class ProductCategoryRepositoryTest extends SpringBootApplicaionTest{

  @Autowired
  private ProductCategoryRepository productCategoryRepository;

  @Test
  public void findByCategoryTypeIn() {
    long start = System.currentTimeMillis();
    List<ProductCategory> list = productCategoryRepository.findByCategoryTypeIn(Arrays.asList(11, 22));
    long end = System.currentTimeMillis();
    System.out.println((end - start) + "ms");
    Assert.assertTrue(list.size() > 0);
  }
}