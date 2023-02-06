package com.litongjava.shop.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Entity
@Table(name="tb_user")
public class User {
  @Id
  private Long id;
  private String username;
  private String password;
  private Integer age;
  private BigDecimal balance;
  private String address;
}
