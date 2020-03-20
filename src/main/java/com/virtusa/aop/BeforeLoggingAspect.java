package com.virtusa.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class BeforeLoggingAspect {

	/***
	 * 
	 * "execution(* get())" == advice applies to all getters "execution("* get(*)"
	 * == advice applies to all getters having one or more input param(s)
	 * "execution(* get(..)" == advice applies to all getters having zero or more
	 * input param(s)
	 * 
	 * combining 2 pointcuts using relational operators
	 */
	@Before("execution( * get*()) && circleMethods()")
	public void logginAdvice() {
		System.out.println("Advice run: Get method called");
	}

	/*
	 * 
	 * Using Pointcut instead of execution()
	 * 
	 * 
	 * @Before("allGetters()") public void secondAdvice() {
	 * System.out.println("Adivce Second run: Geter method"); }
	 */

	@Pointcut("execution(* get*())")
	public void allGetters() {
	}

	/*
	 * within(class) == execution(* * com.virtusa.model.Circle.*)
	 */

	@Pointcut("within(com.virtusa.model.Circle)")
	public void circleMethods() {
	}

	@Before("allGetters() && circleMethods()")
	public void getterDetails(JoinPoint joinpoint) {
		System.out.println(joinpoint.toString());

		/*
		 * Circle circle = (Circle)joinpoint.getTarget() == returns the target object
		 * that triggered the advice and we can make use of the object make any changes
		 */
	}
	
	@Before("args(name)")
	public void argsAdvice(String name) {
		System.out.println("This method is called when we trigger a setter method with String paramater. The value is :"+name);
	}

}
