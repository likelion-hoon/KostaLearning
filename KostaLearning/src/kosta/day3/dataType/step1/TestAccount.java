package kosta.day3.dataType.step1;

public class TestAccount {
	public static void main(String[] args) {
		/*
		 *  Account class�� �̿��� ��ü�� �����Ѵ�.
		 *  �������� a1���� �Ѵ�.
		 */
		Account a1 = new Account(); 
		System.out.println(a1); // ��ü �ּҰ��� ��� 
	
		// Account ��ü�� name�� �������� �Ҵ��Ѵ�. 
		a1.setName("������");
		// �Ҵ��� name�� ����غ���. 
		System.out.println(a1.getName());
		
		// ����
		a1.setBalance(100); 
		System.out.println(a1.getName() + "���� �ܾ�:" + a1.getBalance());
		
	}
}
