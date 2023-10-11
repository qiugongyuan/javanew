package day14;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[]args) {
		HashMap<Integer,String> exc=new HashMap<Integer,String>();
		//实例创建一个整形的key和字符串类型的value
		//添加键对值（key-value）可以使用put()方法
		exc.put(1, "one");
		exc.put(2, "two");
		exc.put(3, "three");
		System.out.println(exc);
		
		HashMap<String,String> cxe=new HashMap<String,String>();
		//创建实例一个字符串类型的key和字符串类型的value
		cxe.put("1one", "one");
		cxe.put("2two", "two");
		cxe.put("3three", "three");
		System.out.println(cxe);
		System.out.println(cxe.size());//通过size()获取元素数量
		System.out.println(cxe.get("2two"));//通过get(key)方法来获取key值对应的value
		System.out.println(cxe.remove("2two"));//通过remove（key）来删除key对应的键值对（key-value）
		System.out.println(cxe);
		for(String value:cxe.values()) //通过for-each循环，只输出value，使用values（）方法
			{
			System.out.println(value);
			
		}
		for(String i:cxe.keySet())//通过keySet()获取key值，在通过get(key)获取对应的value值
		{
			System.out.println("key值："+i+"\n"+"对应的value值："+cxe.get(i));
			
		}


	}

}
