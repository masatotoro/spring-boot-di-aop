package spring.di.java;

import org.springframework.boot.CommandLineRunner;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class JavaController implements CommandLineRunner {

  private final JavaService javaService;

  @Override
  public void run(String... args) {
    javaService.execute();
  }
}
