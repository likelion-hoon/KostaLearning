package kosta.day3.dataType.step1;

public class Account {
	
	// instance variable : 객체의 속성정보를 저장하는 변수 
	private String name;
	private int balance;
	
	// getter method
	public String getName() { 
		return name;
	}

	// String name : local variable - 메서드 실행시 사용되는 임시변수 
	public void setName(String name) {
		this.name = name;
	} 
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
