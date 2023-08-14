package day07;

public class TestArray {
	public static void main(String args[]){
	   int size=4;
	   double[] myList=new double[size];
	   myList[0]=1.1;
	   myList[1]=1.2;
	   myList[2]=1.3;
	   double total=0;
	   for (int i=0;i<size;i++) {
		   total+=myList[i];
		   //total=total.add(myList[i]);
		   
	   }
	   System.out.println("total的值是："+total);
	  }

}
