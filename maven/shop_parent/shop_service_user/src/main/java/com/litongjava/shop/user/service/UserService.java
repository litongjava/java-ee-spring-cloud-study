package com.litongjava.shop.user.service;

import java.util.List;

import com.litongjava.shop.entity.User;

public interface UserService {

  User findById(Long id);

  List<User> findAll();

  void save(User e);

  void update(User e);

  void delete(Long id);
}
