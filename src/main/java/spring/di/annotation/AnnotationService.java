package spring.di.annotation;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AnnotationService {

  public void execute() {
    log.info("### Dependency Injection: AnnotationConfig###");
  }
}
