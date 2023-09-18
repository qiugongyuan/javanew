package day09;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexMatchesReplace {
	private static String REGEX="dog";
	private static String INPUT ="The dog says meow."+
	                      "ALL dogs say meow.";
    private static String REPLACE="CAT";
    public static void main(String[]args) {
    	Pattern p=Pattern.compile(REGEX);
    	Matcher m=p.matcher(INPUT);
    	INPUT=m.replaceAll(REPLACE);
    	System.out.println(INPUT);
    }

}
