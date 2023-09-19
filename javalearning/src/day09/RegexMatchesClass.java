package day09;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexMatchesClass {
	private static String REGEX="a*b";
	private static String INPUT="aabfooaabfooabfoobkkk";
	private static String REPLACE="-";
	private static void main(String[]args) {
		Pattern p=Pattern.compile(REGEX);
		Matcher m=p.matcher(INPUT);
		StringBuffer sb=new StringBuffer();
		while(m.find()) {
			m.appendReplacement(sb,REPLACE);
		}
		m.appendTail(sb);
		System.out.println(sb.toString());
	}

}
