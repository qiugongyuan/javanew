package day04;

public class PuppyAge {
	public void pupAge(){
	      int age=1;
	      age = age + 7;
	      System.out.println("小狗的年龄是 : " + age);
	   }
	   
	   public static void main(String[] args){
		  PuppyAge puppy = new PuppyAge();
	      puppy.pupAge();
	   }

}
