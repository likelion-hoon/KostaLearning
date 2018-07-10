package kosta.day3.dataType.step7.test;

import kosta.day3.dataType.step7.model.RegDate;

public class TestReferenceVariable {

	public static void main(String[] args) {
		RegDate date = new RegDate(2018,7,11); 
		date.setMonth(11);
		
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getDay());
	}
}
