package day04;
//以下实例定义了一个 AppConfig 类，其中包含了三个静态变量 
//APP_NAME、APP_VERSION 和 DATABASE_URL，用于存储应用程序的名称、版本和数据库连接URL。
//这些变量都被声明为 final，表示它们是不可修改的常量
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
