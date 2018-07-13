package kosta.day5.array.step6;

public class TestStringEquals {
	
	/*
	 *  ���ڿ� �񱳽ÿ��� == �����ڷ� ���� �ʰ� 
	 *  �ݵ�� String Ŭ�������� �����ϴ� 
	 *  equals(str) : boolean �޼��带 ����ؼ� 
	 *  ���� ���ڿ��� ���ؾ� �Ѵ�. 
	 */

	public static void main(String[] args) {
		
		// �� ���� ���� ���ͳ� Ǯ������ ��Ģ���� ���� �����Ѵ�. 
		String str1 = "������"; 
		String str2 = "������";
		
		System.out.println(str1==str2); // true
		
		String str3 = new String("������"); 
		
		System.out.println(str3);
		
		
		System.out.println(str1==str3); // false
		
		System.out.println(str1.equals(str3)); // true
		
		StringBuilder sb = new StringBuilder("������"); 
		System.out.println(str1==sb.toString()); // false
		
		// equals�� �����ϸ� ���� ���ڿ� �񱳰� �����ϴ�
		System.out.println(str1.equals(sb.toString())); // true
		
	
		
	}
}
