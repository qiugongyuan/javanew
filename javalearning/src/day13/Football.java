package day13;

public interface Football extends Sports{
	public void homeTeamScored(int points);
	public void visitingTeamScored(int points);
	public void endOfQuarter(int quarter);
//实现Football接口的类需要实现五个方法，其中两个来自于sports接口
}
