package day10.yinhang;

public class InsufficientFundsException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double amount;
	//此处的amount用来储存当出现异常（取出钱多于余额时）所缺乏的钱
	//自定义异常类，继承Exception类
	public InsufficientFundsException(double amount) {
		this.amount=amount;
	
	}
	public double getAmount(){
		return amount;
	}

}
