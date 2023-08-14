package day07;
import java.math.BigDecimal;

public class TestArray1 {
	public static void main(String args[]){
	       int size=3;
	       BigDecimal[] myList=new BigDecimal[size];
	       myList[0]=new BigDecimal("1.1");
	       myList[1]=new BigDecimal("1.2");
	       myList[2]=new BigDecimal("1.3");
	       BigDecimal total = BigDecimal.ZERO;
	       
	       for (int i=0;i<size;i++) {
	           total = total.add(myList[i]);
	       }
	       
	       System.out.println("total的值是："+total);
	    }

}
