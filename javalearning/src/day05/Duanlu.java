package day05;

public class Duanlu {
	public static void main(String[] args){
        int a = 5;//定义一个变量；
        boolean b = (a<4)&&(a++<10);
        boolean c=(a++<10)&&(a<5);
        System.out.println("使用短路逻辑运算符的结果为"+b);
        System.out.println("C的结果为"+c);
        System.out.println("a的结果为"+a);
        //该程序使用到了短路逻辑运算符(&&)，首先判断 a<4 的结果为 false，则 b 的结果必定是 false，所以不再执行第二个操作 a++<10 的判断，所以 a 的值为 5
    }

}
