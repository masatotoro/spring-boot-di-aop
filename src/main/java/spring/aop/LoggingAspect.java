package spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class LoggingAspect {

  @Before("execution(* spring.di.*.*Controller.*(..))")
  public void startLog(JoinPoint joinPoint) {
    log.info(
        "## Controller start: {}#{}", //
        joinPoint.getTarget().getClass().toString(),
        joinPoint.getSignature().getName());
  }

  @After("execution(* spring.di.*.*Controller.*(..))")
  public void invokeAfter(JoinPoint joinPoint) {
    log.info(
        "## Controller end: {}#{}", //
        joinPoint.getTarget().getClass().toString(),
        joinPoint.getSignature().getName());
  }
}
