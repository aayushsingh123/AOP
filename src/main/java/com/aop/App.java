package com.aop;

/*
 * import org.springframework.context.ApplicationContext; import
 * org.springframework.context.support.ClassPathXmlApplicationContext;
 * 

 * 
 * 
 * public class App {
 * 
 * 
 * public static void main( String[] args ) { // System.out.println(
 * "Hello World!" ); //configuration ke liye ApplicationContext context= new
 * ClassPathXmlApplicationContext("com/aop/config.xml"); //bean ka naam tha
 * payment and or kis type ka bin tha PaymentService.class // <bean
 * name="payment" class="com.aop.service.PaymentServcieImpl" /> yeah config.xml
 * hai
 * 
 * 
 * PaymentService paymentObject= context.getBean("payment"
 * ,PaymentService.class); paymentObject.makePayment();
 * 
 * } }
 */



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.aop.service.PaymentService;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/aop/config.xml");
        PaymentService paymentObject = context.getBean("payment", PaymentService.class);
        
        //auth, print:payment started
        paymentObject.makePayment();
    }
}
