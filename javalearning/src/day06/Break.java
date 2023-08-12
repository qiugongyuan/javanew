package day06;

public class Break {
	public static void main(String[]args){
		int a[]= {1,2,3,4,5};
		for (int b:a) {
			if(b>3) {
				continue;
			}
			System.out.println("b的值是："+b);
		}
		
	}

}
