package day12;
class Dongwu{
	public void move() {
		System.out.println("动物可以移动");
	}
}
class Gou extends Dongwu{
	public void move() {
		super.move();// 当需要在子类中调用父类的被重写方法时，要使用 super 关键字,应用super类的方法
		System.out.println("狗可以跑和走");
	}
	public void bark() {
		System.out.print("狗可以吠叫");
	}
}

public class TestDog {
	public static void main(String args[]) {
		Dongwu a=new Dongwu();
		Dongwu b=new Gou();
		//a.move();
		b.move();
		//b.bark();//该程序将抛出一个编译错误，因为b的引用类型Dongwu没有bark方法。
	}

}
