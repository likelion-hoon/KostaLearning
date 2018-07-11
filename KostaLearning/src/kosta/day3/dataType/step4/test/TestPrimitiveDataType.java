package kosta.day3.dataType.step4.test;

public class TestPrimitiveDataType {

	public static void main(String[] args) {
		// ������ ������ Ÿ�� byte, short, int, long
		
		byte b1=1; // byte���� 1byte �������� �����͸� ������ �� �ִ�. 
		
		// byte���� �ּҰ�, �ִ밪�� Ȯ���Ѵ�. 
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		// b1 = 130;  // compile error byte��, �ִ밪 127���� ũ�Ƿ� 
		
		short s = 130; // 2byte �̹Ƿ� ���� 
		int i=2147483647; // �������� �⺻�� 
		
		System.out.println(Integer.MAX_VALUE);
		long lo=i; // i�� int��, lo�� long��(8byte) 
		long l = 1L;
		
		long lo2=2; 
		// int j=lo2; ->  lo2�� 8byte �̱� ������ ���� �ʴ´�. 
		// Ÿ���� long���̹Ƿ� int j�� ����� �� ����. 
		// �Ǽ��� float(4byte)�� double(8byte) 
		// �Ǽ����� �⺻���� double �̴�. 
		
		float f = 3.14f; 
		double d = 3.14; 
		
		// ������ - �ѹ��ڸ� ������ �� ���
		// ���ڿ��� �������� String�� ����Ѵ�. 
		char c = 'a'; 
		// char c1 = 'aa'; // �� ���ڸ� ���� 
		
		// ���� true or flase�� �����ϴ� ������ Ÿ�� 
		boolean chk = true; 
		boolean chk2 = false; 
		// boolean chk3 = 1;  ���� true �Ǵ� false�� ����ȴ�. 
		
		byte by1 = 1; 
		byte by2 = 100;
		// byte by3 = by1 + by2; ����ÿ� int������ �ٲ��. 
		// by3�� ���ο� �������̹Ƿ�..
		
		// byte������ �����ϱ� ���ؼ��� �Ʒ��ڵ�ó��
		// type casting�� �ϸ� �ȴ�. 
		
		byte by3 = (byte) (by1 + by2);  // ���� ����� byte������ ������ ����ȯ ��Ų��. 
		
		
		
	}
}
