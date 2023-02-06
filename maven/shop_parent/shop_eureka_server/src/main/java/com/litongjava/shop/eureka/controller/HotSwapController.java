package com.litongjava.shop.eureka.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @author create by ping-e-lee on 2021年7月12日 下午11:16:48 
 * @version 1.0 
 * @desc
 */
@RestController
@RequestMapping("hotSwap")
@Slf4j
public class HotSwapController {
  @RequestMapping("watchingDirSet")
  public List<String> watchingDirSet() {
    Set<String> watchingDirSet = new HashSet<>();
    String javaClassPath = System.getProperty("java.class.path");
    /**
     * linux ==> /usr/maven/apache-maven-3.3.9/boot/plexus-classworlds-2.5.2.jar
     */
    log.info("javaClassPath:{}",javaClassPath);
    String[] classPathArray = javaClassPath.split(File.pathSeparator);
    log.info("classPathArray:{}",Arrays.toString(classPathArray));
    for (String classPath : classPathArray) {
      buildDirs(new File(classPath.trim()), watchingDirSet);
    }
    
    List<String> dirList = new ArrayList<String>(watchingDirSet);
    Collections.sort(dirList);
    return dirList;
  }
  
  @RequestMapping("classLoader")
  public String classLoader() {
    return this.getClass().getClassLoader().toString(); //=>java.net.URLClassLoader@dee099f
  }
  private void buildDirs(File file, Set<String> watchingDirSet) {
    if (file.isDirectory()) {
      watchingDirSet.add(file.getPath());
      
      File[] fileList = file.listFiles();
      for (File f : fileList) {
        buildDirs(f, watchingDirSet);
      }
    }
  }
}
