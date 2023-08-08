package day04;

public class RunoobTest2 {
	public static void main(String[] args) {
        int a = 10, b = 20;
        int arr[] = exchange(a, b);
        a = arr[0];
        b = arr[1];
        System.out.println("a = " + a + ", b = " + b); // 输出a和b的值
    }
   
    public static int[] exchange(int x, int y) {
    	int arr[] = {y,x};
        return arr;
    }

}
