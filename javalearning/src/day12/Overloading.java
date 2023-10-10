package day12;
//overriding 重写  方法名与参数都一样
//overloading 重载 方法名相同，参数不同
public class Overloading {
	public int test() {
		System.out.println("test1");
		return 1;
	}
	public void test(int a) {
		System.out.println("test2");
	}
	public String test(int a,String s) {
		System.out.println("test3");
		return "returntest3";
	}
	public String test(String s,int a) {
		System.out.println("test4");
		return "returntest4";
	}
	public static void main(String[]args) {
		Overloading o=new Overloading();
		o.test();
		o.test(1);
		o.test(1,"test3");
		o.test("test4", 0);
		
	}
	

	
}
