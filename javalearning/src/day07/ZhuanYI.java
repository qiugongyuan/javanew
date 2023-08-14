package day07;

public class ZhuanYI {
	 public static void main(String[] args) {
	      System.out.println("访问\"菜鸟教程!\"");
	      System.out.println("姓名\t年龄\t学科\t分数\n张三\t12\t英语\t90");
	      String s1 = "Runoob";              // String 直接创建
	      String s2 = "Runoob";              // String 直接创建
	      String s3 = s1;                    // 相同引用
	      String s4 = new String("Runoob");   // String 对象创建
	      String s5 = new String("Runoob");   // String 对象创建
	      System.out.println(s1);
	      System.out.println(s2);
	      System.out.println(s3);
	      System.out.println(s4);
	      System.out.println(s5);


	   }

}
