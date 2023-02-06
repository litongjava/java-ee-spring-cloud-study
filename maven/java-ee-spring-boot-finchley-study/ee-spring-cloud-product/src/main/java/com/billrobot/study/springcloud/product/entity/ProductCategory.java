package com.billrobot.study.springcloud.product.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
public class ProductCategory{
	@Id
	@GeneratedValue
	private int categoryId;
	private String categoryName;
	private int categoryType;
	private Timestamp createTime;
	private Timestamp updateTime;
}