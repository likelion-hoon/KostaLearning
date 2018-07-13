package kosta.day4.if_for_VariableScope.step4;

public class TestSwitch1 {

	public static void main(String[] args) {
		int grade = 3; 
		
		switch(grade) {
			case 1: 
				System.out.println("하버드");
			case 2: 
				System.out.println("북경대");
			case 3: 
				System.out.println("동경대");
			default:
				System.out.println("서울대");
		}
	}
}
