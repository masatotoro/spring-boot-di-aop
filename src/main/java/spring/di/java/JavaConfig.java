package spring.di.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class JavaConfig {

  @Bean
  JavaService javaService() {
    return new JavaService();
  }

  @Bean
  JavaController javaController(JavaService javaService) {
    return new JavaController(javaService);
  }
}
