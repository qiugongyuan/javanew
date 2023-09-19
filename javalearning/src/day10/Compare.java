package day10;
import java.util.Scanner;
public class Compare {
	
	public static int max(int num1,int num2) {
		int result;
		if(num1>num2)
			result=num1;
		else
			result=num2;
		return result;
	}


	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 try {
	     System.out.println("Enter the first number:");
	     int num1 = scanner.nextInt();
	     System.out.println("Enter the second number:");
	     int num2 = scanner.nextInt();
	     //Compare compare=new Compare();
	     int maxx = max(num1, num2);
	     System.out.println("The maximum number is: " + maxx);
	    }catch (Exception e) {
	    	
	    }finally {
	    	if (scanner != null) {
	            scanner.close();
	    }
	}
}
}