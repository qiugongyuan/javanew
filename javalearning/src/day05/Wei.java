package day05;

public class Wei {
	public static void main(String[] args) {
	     int a = 60; /* 60 = 0011 1100 */ 
	     int b = 13; /* 13 = 0000 1101 */
	     int c = 0;
	     c = a & b;       /* 12 = 0000 1100 */
	     //&运算，如果相对应位都是1，则结果为1，否则为0	
	     System.out.println("a & b = " + c );
	 
	     c = a | b;       /* 61 = 0011 1101 */
	     // |运算，如果相对应位都是 0，则结果为 0，否则为 1	
	     System.out.println("a | b = " + c );
	 
	     c = a ^ b;       /* 49 = 0011 0001 */
	     // ^运算，如果相对应位值相同，则结果为0，否则为1	
	     System.out.println("a ^ b = " + c );
	 
	     c = ~a;          /*-61 = 1100 0011 */
	     //~运算，按位取反运算符翻转操作数的每一位，即0变成1，1变成0。	
	     System.out.println("~a = " + c );
	 
	     c = a << 2;     /* 240 = 1111 0000 */
	     //<<运算，按位左移运算符。左操作数按位左移右操作数指定的位数。	
	     System.out.println("a << 2 = " + c );
	 
	     c = a >> 2;     /* 15 = 1111 */
	     //>>运算，按位右移运算符。左操作数按位右移右操作数指定的位数。	
	     System.out.println("a >> 2  = " + c );
	  
	     c = a >>> 2;     /* 15 = 0000 1111 */
	     //>>>按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充。
	     System.out.println("a >>> 2 = " + c );
	  }

}
