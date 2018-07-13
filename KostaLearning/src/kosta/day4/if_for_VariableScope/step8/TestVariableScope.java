package kosta.day4.if_for_VariableScope.step8;

/*
 * 	Variable Scope 변수 범위, 인스턴스 변수와 지역변수의 차이를
 *  확인하는 예제 
 *  
 * 
 */


class VariableScopeEx {
	
	int i; // instance 변수는 자동으로 초기화 된다. 
	
	public void test1(int i) {
		System.out.println(i);
		System.out.println(this.i);
	}
	
	public void test2() {
//		int i; 
		// System.out.println(i); local variable i가 초기화되지 않아서 error
	}
/*	
	public void test3(int money) {
		int result; 
		int bonus2 = 20;
		if(money > 0) {
			result=100; 
			int bonus = 20; // local Variable은 선언된 {실행영역} 내에서만 사용 
			bonus2 = 20; 
		}
		
	//	System.out.println(result); // error
	//	System.out.println(bonus);  // error
		System.out.println(bonus2);
		
	}*/
}

public class TestVariableScope {
	public static void main(String[] args) {
		VariableScopeEx ex = new VariableScopeEx(); 
		ex.test1(2);
		ex.test2(); 
//		ex.test3(5); 
	}
}
