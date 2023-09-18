package day09;

import java.util.regex.Pattern;

public class RegexExample1 {
	public static void main(String[]args) {
		String content="I am pinpai"+"from zhengzhou.com";
		String patten=".*zhengzhou.*";
		boolean isMatch=Pattern.matches(patten, content);
		System.out.println("字符串中是否包含了'zhengzhou'子字符串？"+isMatch);
		
	}

}
