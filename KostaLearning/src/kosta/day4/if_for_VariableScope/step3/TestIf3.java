package kosta.day4.if_for_VariableScope.step3;

public class TestIf3 {

	public static void main(String[] args) {
		MyAccount account = new MyAccount(); 
		account.setBalance(100); 
		System.out.println(account.getBalance());
		account.setBalance(0); // 금액은 0원을 초과해야 합니다
		account.setBalance(-100); // 금액은 0원을 초과해야 합니다
		System.out.println(account.getBalance()); // 100 
		System.out.println("******* 입금 deposit ********\n"); 
		
		account.deposit(50); 
		System.out.println(account.getBalance()); // 150
		
		account.deposit(-10); // 잘못된 입금액입니다. 
		System.out.println(account.getBalance()); // 150
		
		account.deposit(20);
		System.out.println(account.getBalance()); // 170
		System.out.println("\n******* 출금 withdraw ********\n"); 
		
		System.out.println("현재 잔액:"+account.getBalance()); // 170
		
		account.withdraw(30); 
		System.out.println("출금 후 잔액:"+account.getBalance()); // 140
		
		account.withdraw(150); // 잔액이 부족하여 출금할 수 없습니다. 
		
		account.withdraw(50);
		System.out.println("출금 후 잔액:"+account.getBalance()); // 90
	
	}
}
