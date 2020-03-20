package com.virtusa.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AroundLoggingAspect {

	/*
	 * 
	 * @Around -> It is used to when we want to perform both before and after operations
	 * It takes one compulsory argument ProceedingJoinPoint
	 * And to actually make the target method run we have to use proceed method of ProceedingJoinPoint
	 * If the target method returns any value then the @Around advice should also return the value
	 * Here we can get hold of return value and make changes unlike @AfterReturning where we can only get hold of values
	 * Here the return type is Object to get hold of all the return types
	 */
	@Around("allGetters()")
	public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		Object value = null;
		try {
			System.out.println("Before Advice");
			value = proceedingJoinPoint.proceed();
			System.out.println("After Returning Advice");
		}
	     catch (Throwable e) {
			System.out.println("After Throwing Advice");
		}
		
		System.out.println("After(finally) Advice");
		return value;
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}
}
