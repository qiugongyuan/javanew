package day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	public static void main(String[]args) {
		List<String> list=new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		//第一种遍历方法使用 For-Each 遍历 List
		//方法一：
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//			
//		}
		//方法二：
//		for(String str:list) {
//			System.out.println(str);
//		}
//       
		//第二种遍历，把链表变为数组相关的内容进行遍历
		String[]strArray=new String[list.size()];
    	list.toArray(strArray);
    	//方法一：
//    	for(int i=0;i<strArray.length;i++) {
//    	System.out.println(strArray[i]);}
    	//方法二：
//  	for(String str:strArray)  	{   		
//  		System.out.println(str);
//   	}
//		   
    	//第三种遍历 使用迭代器进行相关遍历
    	Iterator<String>ite=list.iterator();
    	while(ite.hasNext())//判断下一个元素之后有值 {
    		System.out.println(ite.next());
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	


	}


