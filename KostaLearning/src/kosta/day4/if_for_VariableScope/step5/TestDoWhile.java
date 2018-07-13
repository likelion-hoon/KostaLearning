package kosta.day4.if_for_VariableScope.step5;

public class TestDoWhile {
	public static void main(String[] args) {
		// do while 조건에 맞지 않아도 반드시 한번은 수행된다. 
		
		int i=1; 
		do { // 먼저 한번 실행 후 조건 검사
		  System.out.println(i);
		} while(i++<10); 
	}
}
