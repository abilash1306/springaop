package com.virtusa.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CustomLoggingAspect {

	/*
	 * 
	 * This is custom advice.It runs for all methods which are annotated with the annotation
	 */
	@Before("@annotation(com.virtusa.custom.aop.Loggable)")
	public void customBeforeAdvice() {
		System.out.println("This is Custom Logging Adive");
	}
}
