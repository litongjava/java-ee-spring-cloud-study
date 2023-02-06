package com.billrobot.study.springcloud.product.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.billrobot.study.springcloud.product.entity.ProductCategory;
import com.billrobot.study.springcloud.product.repository.ProductCategoryRepository;

@RestController
@RequestMapping("ProductCategory")
public class ProductCategoryController {
  @Autowired
  private ProductCategoryRepository pcr;

  //ProductCategory/findByCategoryTypeIn?categoryTypeList=11&categoryTypeList=22
  @RequestMapping("findByCategoryTypeIn")
  List<ProductCategory> findByCategoryTypeIn(Integer[] categoryTypeList) {
    return pcr.findByCategoryTypeIn(Arrays.asList(categoryTypeList));
  }
}
