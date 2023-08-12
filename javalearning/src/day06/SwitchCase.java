package day06;

public class SwitchCase {
	public static void main(String[]args) {
	char grade='Y';
	switch(grade)
	{
	case 'A':
		System.out.println("优秀");
		//break;
	case 'B':
		System.out.println("良好");
		break;
	case 'C':
		System.out.println("及格");
		break;
	default:
		System.out.println("未知等级");
	}
	System.out.println("你的等级是"+grade);
//如果 case 语句块中没有 break 语句时，匹配成功后，从当前 case 开始，后续所有 case 的值都会输出。

//如果 case 语句块中没有 break 语句时，匹配不成功则返回默认 case

	

}
}