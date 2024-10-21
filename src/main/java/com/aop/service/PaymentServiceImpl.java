package com.aop.service;



public class PaymentServiceImpl implements PaymentService {
	 public void makePayment() {// { agar interface mein argument nhi hai toh yeah bhi nhi lagana hai AOP ke case mein
	
	
   // public void makePayment(int amount) { //agar interface mein argument hai toh yeah bhi  lagana hai AOP ke case mein
      /*  System.out.println(amount +"Payment made successfully debitted");
        //
        //
        
        System.out.println(amount +"Payment made successfully creditted");*/
        
        System.out.println("Payment made successfully debitted");
        //
        //
        
        System.out.println("Payment made successfully creditted");
    }

}