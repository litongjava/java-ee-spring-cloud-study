package demo.controller;

import java.util.UUID;

import com.litongjava.tio.http.server.annotation.RequestPath;

@RequestPath
public class ProductController {

  @RequestPath("/product/consul")
  public String paymentConsul() {
    return "tio-boot with consul: " + UUID.randomUUID().toString();
  }
}
