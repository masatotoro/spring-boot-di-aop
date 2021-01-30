package spring.di.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XmlService {

  private static final Logger log //
      = LoggerFactory.getLogger(XmlService.class);

  public void execute() {
    log.info("### Dependency Injection: XmlConfig ###");
  }
}
