package kosta.day4.if_for_VariableScope.step8;

/*
 * 	Variable Scope ���� ����, �ν��Ͻ� ������ ���������� ���̸�
 *  Ȯ���ϴ� ���� 
 *  
 * 
 */


class VariableScopeEx {
	
	int i; // instance ������ �ڵ����� �ʱ�ȭ �ȴ�. 
	
	public void test1(int i) {
		System.out.println(i);
		System.out.println(this.i);
	}
	
	public void test2() {
//		int i; 
		// System.out.println(i); local variable i�� �ʱ�ȭ���� �ʾƼ� error
	}
/*	
	public void test3(int money) {
		int result; 
		int bonus2 = 20;
		if(money > 0) {
			result=100; 
			int bonus = 20; // local Variable�� ����� {���࿵��} �������� ��� 
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
