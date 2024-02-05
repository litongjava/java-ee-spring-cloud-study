package demo.controller;

import java.util.HashMap;
import java.util.Map;

import com.litongjava.tio.http.server.annotation.RequestPath;

@RequestPath("/actuator")
public class ActuatorController {
  public Map<String, String> health() {
    HashMap<String, String> hashMap = new HashMap<>(1);
    hashMap.put("status", "up");
    return hashMap;
  }
}
