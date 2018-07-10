package kosta.day3.dataType.step5.test;

import kosta.day3.dataType.step2.Person;

public class TestReferenceDataType {

	public static void main(String[] args) {
		
		int i=1;  // primitive data type, i는 지역변수
		Person p; // reference data type
		p = new Person();  // 객체 생성해서 p에 참조시킨다. 
		// p는 참조변수 (reference variable) 
		
		System.out.println(p); // 객체의 주소값 출력
		System.out.println(i); // 저장한 데이터 1이 출력 
		
		
		
		
	}
}
