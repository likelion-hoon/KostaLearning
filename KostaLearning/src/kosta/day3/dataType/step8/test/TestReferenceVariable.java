package kosta.day3.dataType.step8.test;

import kosta.day3.dataType.step7.model.RegDate;

// ���������� �ּ� �� ���Ҵ�� � ������ ��µǴ°� 
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