package day10;

public class ExcepTest {
	public static void main(String args[]) {
		try {
			int a[]=new int[2];
			System.out.println("Access element three:"+a[2]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown:"+e);
		}
		System.out.println("out of the block");
	}

}
