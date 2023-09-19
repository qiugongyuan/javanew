package day10;

public class FinalizationDemo {
	public static void main(String[]args) {
		Cake c1=new Cake(1);
		Cake c2=new Cake(2);
		Cake c3=new Cake(3);
		c2=c3=null;//这段代码中，Cake object1没有被回收的原因是它没有被垃圾回收。在Java中，只有当一个对象没有引用时，才会被垃圾回收。在这个例子中，c2和c3已经被设置为null，因此它们没有被引用。只有当c1不再被引用时，它才会被垃圾回收
		System.gc();
	}

}
class Cake extends Object{
	private int id;
	public Cake(int id) {
		this.id=id;
		System.out.println("Cake object"+id+"is created");
	}
    protected void finalize() throws java.lang.Throwable{
    	super.finalize();
    	System.out.println("Cake object"+id+"is disposed");
    }
}
