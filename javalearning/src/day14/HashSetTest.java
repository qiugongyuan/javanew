package day14;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[]args) {
		HashSet<String> rules=new HashSet<String>();
		rules.add("1");
		rules.add("2");
		rules.add("3");
		rules.add("1");// 重复的元素不会被添加
		rules.remove("2");//使用remove删除元素
		System.out.println(rules);
		System.out.println(rules.size());//使用size()计算集合中的元素数量
		System.out.println(rules.contains("1"));//使用contains判断元素是否存在于集合中
		for(String str:rules)//for-each循环输出集合中所有元素
			{
			System.out.println(str);
		}
		rules.clear();
		System.out.println(rules);//使用clear删除所有的元素
		
		
	}

}
