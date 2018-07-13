package kosta.day4.if_for_VariableScope.step2;

public class MyDate {
	private int month = 1; 
	
	public MyDate(int month) {
		if(month >=1 && month <=12)
			this.month = month; 
		else
			System.out.println("잘못된 월 정보입니다.");
	}
	
	public int getMonth() {
		return this.month; 
	}
}
