package spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"DI.xml"})
public class SpringDiAopApplication {

  public static void main(String[] args) {
    SpringApplication.run( //
        SpringDiAopApplication.class, args);
  }
}
