package io.bank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring3.xml");

        BankAccountController controller = (BankAccountController)context.getBean("controller");


        System.out.println(controller.getBalance(123)); // Sara's balance current
        System.out.println(controller.deposit(123,10000)); //amount deposit in Sara's account
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println(controller.withdraw(123,50000)); // withdrawn from Sara
        System.out.println(controller.getBalance(123));  // new balance
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println(controller.fundTransfer(123,456,10000)); //transfer 10000 to Kevin
        System.out.println(controller.getBalance(123));  //final balance for Sara
        System.out.println(controller.getBalance(456));  //final balance for Kevin
	}

}
