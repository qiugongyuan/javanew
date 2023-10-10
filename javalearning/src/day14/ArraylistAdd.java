package day14;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistAdd {
	public static void main(String[]args) {
		ArrayList<String> tiantian=new ArrayList<String>();
		//添加元素add
		tiantian.add("sun");
		tiantian.add("mon");
		tiantian.add("FIR");
		tiantian.set(1, "TUE");//修改元素，.set(index,value)
		tiantian.remove(2);//删除元素，.remove(insex)
		System.out.println(tiantian);
		System.out.println(tiantian.get(1));//访问元素，.get(index)
		System.out.println(tiantian.size());//计算ArrayList中的元素数量
		for(int i=0;i<tiantian.size();i++) {
			System.out.println(tiantian.get(i));//通过for循环来迭代数组列表中的元素
		}
		for(String str:tiantian) {
			System.out.println(str);//通过for-each循环来迭代数组列表中的元素
		}
		Collections.sort(tiantian);//对字母排序
		for(String str:tiantian) {
			System.out.println(str);//通过for-each循环来迭代数组列表中的元素
		}
		
		ArrayList<Integer> myNumbers=new ArrayList<Integer>();
		myNumbers.add(1);
		myNumbers.add(3);
		myNumbers.add(2);
		for (int u:myNumbers) {
			System.out.println(u);
		}
		Collections.sort(myNumbers);//对数字排序
		for (int u:myNumbers) {
			System.out.println(u);
		}
		
	}

}
