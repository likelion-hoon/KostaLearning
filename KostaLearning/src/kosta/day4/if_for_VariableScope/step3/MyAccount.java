package kosta.day4.if_for_VariableScope.step3;

public class MyAccount {
	
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance <= 0)
			System.out.println("�ݾ��� 0���� �ʰ��ؾ� �մϴ�.");
		else 
			this.balance = balance;
	} 
	
	// �Ա� �Լ�
	public void deposit(int money) {
		if(money > 0)
			balance += money; 
		else
			System.out.println("�Աݾ��� 0���� �ʰ��ؾ� �մϴ�.");
	}
	
	// ��� �Լ� 
	public void withdraw(int money) {
		if(money <= 0) 
			System.out.println("��ݾ��� 0�� �̻��̾�� �մϴ�.");
		else if(balance >= money) 
			balance -= money; 
		else
			System.out.println("�ܾ��� �����Ͽ� ����� �� �����ϴ�.");
	}
	
}
