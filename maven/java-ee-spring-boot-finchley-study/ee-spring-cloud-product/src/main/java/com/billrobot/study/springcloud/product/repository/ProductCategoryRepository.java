package com.billrobot.study.springcloud.product.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.billrobot.study.springcloud.product.entity.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
  List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
