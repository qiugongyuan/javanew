package day10.yinhang;
import java.io.*;



public class BankDemo {
	public static void main(String[]args) {
		CheckingAccount C=new CheckingAccount(101);
		System.out.println("存500");
		C.deposit(500);
		try
		{
			System.out.println("取100");
			C.withdraw(100);
			System.out.print("取600");
			C.withdraw(600);
		}catch(InsufficientFundsException e) {
			System.out.println("钱不够,少了"+e.getAmount());
			e.printStackTrace();
			
		}
	}

}
