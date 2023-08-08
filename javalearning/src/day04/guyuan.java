package day04;

public class guyuan {
	public String name;
	private double salary;
	public guyuan(String gyName) {
		name=gyName;
	}
	public void setSalary(double gySal) {
		salary=gySal;		
	}
	public void printGy() {
		System.out.println("名字："+name);
		System.out.println("薪水："+salary);
	}
	public static void main(String[]args) {
		guyuan nmone=new guyuan("张三");
		nmone.setSalary(3000);
		nmone.printGy();
	}

}
