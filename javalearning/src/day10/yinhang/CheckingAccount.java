package day10.yinhang;
public class CheckingAccount {
	   private double balance; // 余额
	   private int number;

	   public CheckingAccount(int number) {
	       this.number = number;
	   }

	   // 方法：存钱
	   public void deposit(double amount) {
	       balance += amount;
	   }

	   // 方法：取钱
	   public void withdraw(double amount) throws InsufficientFundsException {
	       if (amount <= balance) {
	           balance -= amount;
	       } else {
	           double needs = amount - balance;
	           throw new InsufficientFundsException(needs);
	       }
	   }

	   // 方法：返回余额
	   public double getBalance() {
	       return balance;
	   }

	   // 方法：返回卡号
	   public int getNumber() {
	       return number;
	   }
	}



