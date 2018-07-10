package kosta.day3.dataType.step4.test;

public class TestPrimitiveDataType {

	public static void main(String[] args) {
		// 정수형 데이터 타입 byte, short, int, long
		
		byte b1=1; // byte형은 1byte 범위내의 데이터를 저장할 수 있다. 
		
		// byte형의 최소값, 최대값을 확인한다. 
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		// b1 = 130;  // compile error byte형, 최대값 127보다 크므로 
		
		short s = 130; // 2byte 이므로 가능 
		int i=2147483647; // 정수형의 기본형 
		
		System.out.println(Integer.MAX_VALUE);
		long lo=i; // i는 int형, lo는 long형(8byte) 
		long l = 1L;
		
		long lo2=2; 
		// int j=lo2; ->  lo2는 8byte 이기 때문에 들어가지 않는다. 
		// 타입이 long형이므로 int j에 저장될 수 없다. 
		// 실수형 float(4byte)과 double(8byte) 
		// 실수형의 기본형은 double 이다. 
		
		float f = 3.14f; 
		double d = 3.14; 
		
		// 문자형 - 한문자를 저장할 때 사용
		// 문자열은 참조형인 String을 사용한다. 
		char c = 'a'; 
		// char c1 = 'aa'; // 한 문자만 가능 
		
		// 논리형 true or flase를 저장하는 데이터 타입 
		boolean chk = true; 
		boolean chk2 = false; 
		// boolean chk3 = 1;  오직 true 또는 false만 저장된다. 
		
		byte by1 = 1; 
		byte by2 = 100;
		// byte by3 = by1 + by2; 연산시에 int형으로 바뀐다. 
		// by3은 새로운 정수값이므로..
		
		// byte형으로 저장하기 위해서는 아래코드처럼
		// type casting을 하면 된다. 
		
		byte by3 = (byte) (by1 + by2);  // 연산 결과를 byte형으로 강제적 형변환 시킨다. 
		
		
		
	}
}
