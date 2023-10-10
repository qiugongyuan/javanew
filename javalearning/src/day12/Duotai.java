package day12;
abstract class Animal{
	abstract void eat();
}
class Cat extends Animal{
	public void eat() {
		System.out.println("猫吃鱼");
	}
	public void work() {
		System.out.println("猫抓老鼠");
	}
}

class Dog extends Animal{
	public void eat() {
		System.out.println("狗吃骨头");
	}
	public void work() {
		System.out.println("狗看家");
	}
}


public class Duotai {
	public static void show(Animal a) {
		a.eat(); // 类型判断
		if (a instanceof Cat) {// 猫做的事情 
			Cat c=(Cat)a;
			c.work();
		}else if(a instanceof Dog) { // 狗做的事情 
			Dog c=(Dog)a;
			c.work();
		}
	}
	public static void main(String args[]) {
		show(new Cat()); // 以 Cat 对象调用 show 方法
		show(new Dog());// 以 Dog 对象调用 show 方法
		
		Animal a=new Cat();// 向上转型
		a.eat();// 调用的是 Cat 的 eat
		Cat c=(Cat)a; // 向下转型  
		c.work(); // 调用的是 Cat 的 work
	}

}
