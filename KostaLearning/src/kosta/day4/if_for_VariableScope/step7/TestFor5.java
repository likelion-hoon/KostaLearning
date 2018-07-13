package kosta.day4.if_for_VariableScope.step7;

public class TestFor5 {
	public static void main(String[] args) {

		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.println(i + " : " + j);
			}
			System.out.println();
		}
	}
}
