package com.litongjava.shop.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.litongjava.shop.entity.User;
import com.litongjava.shop.user.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
  @Autowired
  private UserService userService;

  @GetMapping
  public List<User> findAll(){
    return userService.findAll();
  }

  @GetMapping("/{id}")
  public User findById(Long id){
    return userService.findById(id);
  }

  @PostMapping
  public String save(User user){
    userService.save(user);
    return "保存成功";
  }

  @DeleteMapping
  public String delete(Long id){
    userService.delete(id);
    return "删除成功";
  }

}
