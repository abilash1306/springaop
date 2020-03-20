package com.virtusa.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterLoggingAspect {

	/*
	 * 
	 * @After == finally(because it runs for all cases
	 * 1)After successfull returning of a method call
	 * 2)After throwing an exception in a method call 
	 */
	@After("args(name)")
	public void afterAdvice(String name) {
		System.out.println("This is After Advice method call. The value is:"+name);
	}
	
	
	/*
	 * 
	 * @AfterReturning -> runs only if the method returns successfully 
	 * We can get hold of return value using returning 
	 * Here the type is Object to get hold of all types of return values
	 * But we cannot change the values
	 */
	@AfterReturning(pointcut = "args(name)",returning = "returnValue")
	public void afterReturning(String name,Object returnValue) {
		System.out.println("This is AferReturning advice call. The value is:"+returnValue);
	}
	
	
	/*
	 * 
	 * @AfterThrowing -> runs only if the method throws an exception
	 * We can get hold of exception using throwing
	 * Here the exceptiontype is Exception(generic) to get hold of all the exception types
	 */
	@AfterThrowing(pointcut="args(name)",throwing="ex")
	public void afterThrowing(String name,Exception ex) {
		System.out.println("This is AfterThrowing advice call.The exception thrown is:"+ex);
	}

}
