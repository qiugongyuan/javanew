package day14;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
	public static void main(String[]args) {
		//创建集合
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("1");
		arr.add("2");
		arr.add("3");
		
		Iterator<String> it=arr.iterator();//使用iterator（）方法获取集合的一个迭代器
		System.out.println(it.next());//next（）输出第一个元素
		while(it.hasNext()) {
			System.out.println(it.next());//next()返回迭代器的下一个元素，并将迭代器的指针移到下一个位置
		}
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> no=numbers.iterator();
        while(no.hasNext()) {
        	Integer m=no.next();
        	if(m<10) {
        		no.remove();
        	}
        }
        System.out.println(numbers);	      

 
	}

}
