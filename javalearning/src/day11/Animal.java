package day11;

public class Animal {
	private String name;
	private int id;
	public Animal(String myName,int myid) {
		name=myName;
		id=myid;
	}
	public void eat() {
		System.out.println(name+"吃");
	}
	public void sleep() {
		System.out.println(name+"睡");
	}
	public void introduction() {
		System.out.println("大家好，我是"+name+"id是："+id);
	}
}


