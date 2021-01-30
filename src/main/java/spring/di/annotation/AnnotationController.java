package spring.di.annotation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
class AnnotationController implements CommandLineRunner {

  private final AnnotationService annotationService;

  @Override
  public void run(String... args) throws Exception {
    annotationService.execute();
  }
}
