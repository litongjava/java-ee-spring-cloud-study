package com.litongjava.shop.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.litongjava.shop.entity.User;
import com.litongjava.shop.user.dao.UserDao;
import com.litongjava.shop.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserDao userDao;
  @Override
  public User findById(Long id) {
    return userDao.findById(id).get();
  }

  @Override
  public List<User> findAll() {
    return userDao.findAll();
  }

  @Override
  public void save(User e) {
    userDao.save(e);
  }

  @Override
  public void update(User e) {
    userDao.save(e);
  }

  @Override
  public void delete(Long id) {
    userDao.deleteById(id);
  }
}
