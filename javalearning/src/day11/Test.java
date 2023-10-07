package day11;
class Animal1{
	void eat() {
		System.out.println("animal:eat");
	}
}
class Dog extends Animal1{
	void eat() {
		System.out.println("dog:eat");
	}
	void eatTest() {
		this.eat();
		super.eat();
	}
}
public class Test {
	public static void main(String[]args) {
		Animal1 a=new Animal1();
		a.eat();
		Dog d=new Dog();
		d.eatTest();
	}

}
