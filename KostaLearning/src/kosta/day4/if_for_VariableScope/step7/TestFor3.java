package kosta.day4.if_for_VariableScope.step7;

public class TestFor3 {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++, System.out.println()) {
			for(int j=0; j<3; j++) {
				System.out.print(j+" ");
			}
		}
	}
}
