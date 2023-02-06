package com.litongjava.shop.test.test;

import com.litongjava.shop.test.annotation.EnableUserBean;
import com.litongjava.shop.test.bean.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 通过在类上声明@EnableUserBean，会自动的加载所有对象
 */
@EnableUserBean
public class EnableUserBeanTest {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
      new AnnotationConfigApplicationContext(EnableUserBeanTest.class);
    User user = context.getBean(User.class);
    System.out.println(user);
    context.close();
  }
}

//EnableUserBean-->@Import(UserImportSelector.class)-->selectImports-->UserConfiguration-->User