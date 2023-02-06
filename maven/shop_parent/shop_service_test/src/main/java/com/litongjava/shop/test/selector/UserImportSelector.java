package com.litongjava.shop.test.selector;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import com.litongjava.shop.test.config.UserConfiguration;

@Slf4j
public class UserImportSelector implements ImportSelector {
  @Override
  public String[] selectImports(AnnotationMetadata importingClassMetadata) {
    //获取配置类名称
    String name = UserConfiguration.class.getName();
    log.info("name:{}",name);
    return new String[]{name};
  }
}
