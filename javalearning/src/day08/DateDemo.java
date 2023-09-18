package day08;
import java.util.*;
import java.text.*;

public class DateDemo {
	public static void main(String[]args) {
		Date data=new Date();
	    System.out.printf("%tY-%tm-%td %tH:%tM:%tS %tZ", data, data, data, data, data, data,data);
	    System.out.printf("\n");
		System.out.println(data.toString());
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
		System.out.println("当前时间是："+ft.format(data));
	}

}
