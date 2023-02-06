package com.litongjava.shop.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Entity
@Table(name="tb_order")
public class Order {
  @Id
  private Long id;
  private Long userId;
  private Long productId;
  private Long number;
  private BigDecimal price;
  private BigDecimal amount;
  private String productName;
  private String username;
}
