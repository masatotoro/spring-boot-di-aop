package spring.di.xml;

import org.springframework.boot.CommandLineRunner;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class XmlController implements CommandLineRunner {

  public final XmlService xmlService;

  @Override
  public void run(String... args) {
    xmlService.execute();
  }
}
