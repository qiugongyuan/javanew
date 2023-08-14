package day07;

public class TestArray2 {
	public static void main(String[]args) {
		double [] myList= {1.2,1.3,1.4};
		double total=0;
		for (int i=0;i<myList.length;i++) {
			System.out.println(myList[i]);//循环输出myList里面的所有值
			total+=myList[i];
		}
		
		System.out.println(total);//输出myList里面所有数据之和
	}

}
