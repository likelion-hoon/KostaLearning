package kosta.day3.dataType.step6.test;

import kosta.day3.dataType.step6.model.Friend;

// 참조변수에 대한 예제 
public class TestReferenceVariable {

	public static void main(String[] args) {
		/*
		 * Friend : reference data type 
		 * f : reference variable 
		 * Friend() : Constructor 생성자 
		 */
		
		Friend f = new Friend("아이유"); 
		System.out.println(f.getName());
		
		// 인스턴스 변수의 명시적인 초기화된 1이 출력 
		System.out.println(f.getAge());
		
		// int형의 기본값 0 출력
		System.out.println(f.getMoney());
		
		// String형의 기본값인 null 출력
		System.out.println(f.getAddress());
	}
}
