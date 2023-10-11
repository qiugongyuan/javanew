package day14;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String args[]) {
		LinkedList<String> tiantian=new LinkedList<String>();
		tiantian.add("mon");
		tiantian.add("tue");
		tiantian.add("fir");
		tiantian.addFirst("sun");//使用 addFirst() 在头部添加元素
		tiantian.addLast("aaa");// 使用 addLast() 在尾部添加元素
		System.out.println(tiantian);
		System.out.println(tiantian.getFirst());
		tiantian.removeFirst();
		tiantian.removeLast();
		System.out.println(tiantian);
	}

}
