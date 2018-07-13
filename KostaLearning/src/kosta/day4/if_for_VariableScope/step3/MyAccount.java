package kosta.day4.if_for_VariableScope.step3;

public class MyAccount {
	
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance <= 0)
			System.out.println("금액은 0원을 초과해야 합니다.");
		else 
			this.balance = balance;
	} 
	
	// 입금 함수
	public void deposit(int money) {
		if(money > 0)
			balance += money; 
		else
			System.out.println("입금액은 0원을 초과해야 합니다.");
	}
	
	// 출금 함수 
	public void withdraw(int money) {
		if(money <= 0) 
			System.out.println("출금액은 0원 이상이어야 합니다.");
		else if(balance >= money) 
			balance -= money; 
		else
			System.out.println("잔액이 부족하여 출금할 수 없습니다.");
	}
	
}
