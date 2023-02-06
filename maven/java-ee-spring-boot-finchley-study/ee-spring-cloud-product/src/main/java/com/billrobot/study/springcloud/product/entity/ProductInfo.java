package com.billrobot.study.springcloud.product.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the product_info database table.
 * 
 */
@Entity
@Table(name = "product_info")
@NamedQuery(name = "ProductInfo.findAll", query = "SELECT p FROM ProductInfo p")
public class ProductInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "product_id")
  private String productId;

  @Column(name = "category_type")
  private int categoryType;

  @Column(name = "create_time")
  private Timestamp createTime;

  @Column(name = "product_description")
  private String productDescription;

  @Column(name = "product_icon")
  private String productIcon;

  @Column(name = "product_name")
  private String productName;

  @Column(name = "product_price")
  private BigDecimal productPrice;

  @Column(name = "product_status")
  private byte productStatus;

  @Column(name = "product_stock")
  private int productStock;

  @Column(name = "update_time")
  private Timestamp updateTime;

  public ProductInfo() {
  }

  public String getProductId() {
    return this.productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public int getCategoryType() {
    return this.categoryType;
  }

  public void setCategoryType(int categoryType) {
    this.categoryType = categoryType;
  }

  public Timestamp getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
  }

  public String getProductDescription() {
    return this.productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  public String getProductIcon() {
    return this.productIcon;
  }

  public void setProductIcon(String productIcon) {
    this.productIcon = productIcon;
  }

  public String getProductName() {
    return this.productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public BigDecimal getProductPrice() {
    return this.productPrice;
  }

  public void setProductPrice(BigDecimal productPrice) {
    this.productPrice = productPrice;
  }

  public byte getProductStatus() {
    return this.productStatus;
  }

  public void setProductStatus(byte productStatus) {
    this.productStatus = productStatus;
  }

  public int getProductStock() {
    return this.productStock;
  }

  public void setProductStock(int productStock) {
    this.productStock = productStock;
  }

  public Timestamp getUpdateTime() {
    return this.updateTime;
  }

  public void setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
  }

}