package demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.litongjava.tio.boot.TioApplication;
import com.litongjava.tio.boot.context.Context;

@Configuration
public class TioApplicationConfig {

  @Bean(destroyMethod = "close")
  public Context myBean(ApplicationArguments args) {
    String[] sourceArgs = args.getSourceArgs();
    return TioApplication.run(ProductApp.class, sourceArgs);
  }
}

