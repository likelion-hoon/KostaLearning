package kosta.day4.if_for_VariableScope.step3;

public class TestIf3 {

	public static void main(String[] args) {
		MyAccount account = new MyAccount(); 
		account.setBalance(100); 
		System.out.println(account.getBalance());
		account.setBalance(0); // �ݾ��� 0���� �ʰ��ؾ� �մϴ�
		account.setBalance(-100); // �ݾ��� 0���� �ʰ��ؾ� �մϴ�
		System.out.println(account.getBalance()); // 100 
		System.out.println("******* �Ա� deposit ********\n"); 
		
		account.deposit(50); 
		System.out.println(account.getBalance()); // 150
		
		account.deposit(-10); // �߸��� �Աݾ��Դϴ�. 
		System.out.println(account.getBalance()); // 150
		
		account.deposit(20);
		System.out.println(account.getBalance()); // 170
		System.out.println("\n******* ��� withdraw ********\n"); 
		
		System.out.println("���� �ܾ�:"+account.getBalance()); // 170
		
		account.withdraw(30); 
		System.out.println("��� �� �ܾ�:"+account.getBalance()); // 140
		
		account.withdraw(150); // �ܾ��� �����Ͽ� ����� �� �����ϴ�. 
		
		account.withdraw(50);
		System.out.println("��� �� �ܾ�:"+account.getBalance()); // 90
	
	}
}
