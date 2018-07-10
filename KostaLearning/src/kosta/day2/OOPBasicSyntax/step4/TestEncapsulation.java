package kosta.day2.OOPBasicSyntax.step4;

public class TestEncapsulation {
	public static void main(String[] args) {
		
		Account a = new Account(); 
		// name은 private이므로 접근 불가능 
		a.setName("아이유");
		a.setBalance(100);
		
		System.out.println(a.getName()+" : "+a.getBalance());
	}
}
