package day12.xinshui;

public class Salary extends Employee{
	private double salary;

	public Salary(String name, String address, int number,double salary) {
		super(name, address, number);
		// TODO Auto-generated constructor stub
		setSalary(salary);
	}
	public void mailCheck() {
		System.out.println("salary类的mailcheck方法");
		System.out.println("邮寄支票给："+getName()+"，工资为："+salary);
		
	}
	public double getSalary() {
		return salary;
		
	}
	public void setSalary(double newSalary) {
		if(newSalary>=0.0) {
			salary=newSalary;
		}
		
	}
	
	public double computePay() {
		System.out.print("计算工资，付给："+getName());
		return salary/52;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
