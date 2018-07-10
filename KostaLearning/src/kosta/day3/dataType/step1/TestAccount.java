package kosta.day3.dataType.step1;

public class TestAccount {
	public static void main(String[] args) {
		/*
		 *  Account class를 이용해 객체를 생성한다.
		 *  변수명은 a1으로 한다.
		 */
		Account a1 = new Account(); 
		System.out.println(a1); // 객체 주소값이 출력 
	
		// Account 객체의 name에 아이유를 할당한다. 
		a1.setName("아이유");
		// 할당한 name을 출력해본다. 
		System.out.println(a1.getName());
		
		// 연습
		a1.setBalance(100); 
		System.out.println(a1.getName() + "님의 잔액:" + a1.getBalance());
		
	}
}
