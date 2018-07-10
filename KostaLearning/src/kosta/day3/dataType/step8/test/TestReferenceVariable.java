package kosta.day3.dataType.step8.test;

import kosta.day3.dataType.step7.model.RegDate;

// 참조변수의 주소 값 재할당시 어떤 정보가 출력되는가 
public class TestReferenceVariable {

	public static void main(String[] args) {
		RegDate date1 = new RegDate(2019, 1, 2); 
		RegDate date2 = new RegDate(2020, 7, 11); 
		date1 = date2; 
		
		System.out.println(date1.getYear());
		System.out.println(date1.getMonth());
		System.out.println(date1.getDay());
	}
}
