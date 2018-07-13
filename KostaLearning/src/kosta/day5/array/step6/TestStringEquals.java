package kosta.day5.array.step6;

public class TestStringEquals {
	
	/*
	 *  문자열 비교시에는 == 연산자로 하지 않고 
	 *  반드시 String 클래스에서 제공하는 
	 *  equals(str) : boolean 메서드를 사용해서 
	 *  실제 문자열을 비교해야 한다. 
	 */

	public static void main(String[] args) {
		
		// 힙 영역 안의 리터널 풀에서의 규칙으로 동시 참조한다. 
		String str1 = "아이유"; 
		String str2 = "아이유";
		
		System.out.println(str1==str2); // true
		
		String str3 = new String("아이유"); 
		
		System.out.println(str3);
		
		
		System.out.println(str1==str3); // false
		
		System.out.println(str1.equals(str3)); // true
		
		StringBuilder sb = new StringBuilder("아이유"); 
		System.out.println(str1==sb.toString()); // false
		
		// equals를 적용하면 실제 문자열 비교가 가능하다
		System.out.println(str1.equals(sb.toString())); // true
		
	
		
	}
}
