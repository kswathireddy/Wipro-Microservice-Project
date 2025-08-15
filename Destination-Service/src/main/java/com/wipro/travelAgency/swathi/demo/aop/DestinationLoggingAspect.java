package com.wipro.travelAgency.swathi.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class DestinationLoggingAspect {
	 @Before("execution(* com.wipro.travelAgency.swathi.demo.controller.DestinationController.*(..))")
	    public void logBeforeUserMethods(JoinPoint joinPoint) {
	    	 log.info("📌 Before calling addUser method");
	         log.info("👉 Method name: {}", joinPoint.getSignature().getName());
	         log.info("✅ Logging aspect triggered successfully");
	    }
	
}
