package com.litongjava.shop.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.litongjava.shop.entity.User;

public interface UserDao extends JpaRepository<User,Long>, JpaSpecificationExecutor<User> {}
