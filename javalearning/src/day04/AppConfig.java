package day04;

public class AppConfig {
	public static final String APP_NAME="MyApp";
	public static final String APP_VERSION="1.0.0";
	public static final String DATABASE_URL="jdbc:mysql://localhost:3306/mydb";
	
	public static void main(String[] args) {
		System.out.println("项目名称："+AppConfig.APP_NAME);
		System.out.println("项目版本："+AppConfig.APP_VERSION);
		System.out.println("数据库地址："+AppConfig.DATABASE_URL);
	}

}
