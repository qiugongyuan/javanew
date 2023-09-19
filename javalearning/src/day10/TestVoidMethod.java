package day10;

import java.util.Scanner;
import java.util.Scanner;
public class TestVoidMethod {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("得到了多少分:");
	    double grade = scanner.nextDouble();
		printGrade(grade);
	}
    public static void printGrade(double score) {
    	if (score>=90.0) {
    		System.out.println('A');
    	}
    	else if(score>=80.0) {
    		System.out.println('B');
    	}
    	else if(score>=70.0) {
    		System.out.println('C');
    	}
    	else if(score>=60) {
    		System.out.println('D');
    	}
    	else {
    		System.out.print('F');
    	}
    }
}
