package kosta.day4.if_for_VariableScope.step4;

public class TestSwitch2 {

	public static void main(String[] args) {
		int grade = 1; 
		
		switch(grade) {
		case 1: 
			System.out.println("하버드");
			break;
		case 2: 
			System.out.println("북경대");
			break;
		case 3: 
			System.out.println("동경대");
			break;
		}
	}
}
