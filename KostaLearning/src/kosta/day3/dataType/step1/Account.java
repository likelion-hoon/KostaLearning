package kosta.day3.dataType.step1;

public class Account {
	
	// instance variable : ��ü�� �Ӽ������� �����ϴ� ���� 
	private String name;
	private int balance;
	
	// getter method
	public String getName() { 
		return name;
	}

	// String name : local variable - �޼��� ����� ���Ǵ� �ӽú��� 
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
