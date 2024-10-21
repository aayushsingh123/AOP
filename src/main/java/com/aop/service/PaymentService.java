package com.aop.service;



public interface PaymentService {
	
	public void makePayment(); //agar argument nhi hai toh impl class mein bhi nhi hina chahiye
   // public void makePayment(int amount);  //agar argument  hai toh impl class mein bhi  hona chahiye
}

