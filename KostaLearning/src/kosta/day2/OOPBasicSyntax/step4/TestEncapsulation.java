package kosta.day2.OOPBasicSyntax.step4;

public class TestEncapsulation {
	public static void main(String[] args) {
		
		Account a = new Account(); 
		// name�� private�̹Ƿ� ���� �Ұ��� 
		a.setName("������");
		a.setBalance(100);
		
		System.out.println(a.getName()+" : "+a.getBalance());
	}
}
