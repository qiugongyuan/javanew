package day05;
//自增自减运算符
public class selfAddMinus {
	public static void main(String[]args) {
		int a=5;
		int b=5;
		int x=2*++a;
		int y=2*b++;
		System.out.println("自增运算符前缀运算后a="+a+",x="+x);
		System.out.println("自增运算符后缀运算后b="+b+",y="+y);
	}

}
