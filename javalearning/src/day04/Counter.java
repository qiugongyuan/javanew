package day04;

public class Counter {
	public static int count=0;
	public Counter() {
		count++;
	}
	public static int getCount() {
		return count;		
	}
	public static void main(String[]args) {
		Counter test1=new Counter();
		Counter test2=new Counter();
		System.out.println("目前为止创建的对象数: "+getCount());
	}

}
