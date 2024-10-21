package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	@Before("execution(* com.aop.service.PaymentServiceImpl.makePayment())")//agar argument nhi hai toh yeah bhi nhi hoga
	//@Before("execution(* com.aop.service.PaymentServiceImpl.makePayment(..))")////agar argument  hai toh yeah bhi hona hoga
	public void printBefore() {
		System.out.println("payment Started");
	}
	@After("execution(* com.aop.service.PaymentServiceImpl.makePayment())")//agar argument nhi hai toh yeah bhi nhi hoga
	//@After("execution(* com.aop.service.PaymentServiceImpl.makePayment(..))")////agar argument  hai toh yeah bhi hona hoga
	public void printAfter() {
		System.out.println("payment Done");

}
}