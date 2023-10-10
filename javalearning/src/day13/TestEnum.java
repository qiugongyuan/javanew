package day13;
public class TestEnum {
	//枚举类也可以声明在内部类中
enum Color{
	RED,GREEN,BLUE;
}


	public static void main(String[]args) {
//		Color c=Color.RED;
//		System.out.println(c);
//		for (Color c:Color.values()) {
//			System.out.println(c);
//		}//循环
//		switch(c) {
//		case GREEN:
//			System.out.println("绿色");
//			break;
//		case BLUE:
//			System.out.println("蓝色");
//			break;
//		case RED:
//			System.out.println("红色");
//			break;
//		}
		Color []arr=Color.values();
		for(Color col:arr) {
			System.out.println(col+" is the index of "+col.ordinal());
			//ordinal()方法可以找到每个枚举常量的索引，就像数组索引一样
			System.out.println(col);
		}
		
	}

}
