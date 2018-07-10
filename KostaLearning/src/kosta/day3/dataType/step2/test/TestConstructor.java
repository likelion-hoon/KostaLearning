package kosta.day3.dataType.step2.test;

import kosta.day3.dataType.step2.model.CreditCard;

/*
 *  생성자를 정의하고 테스트하는 예제 
 */

public class TestConstructor {

	public static void main(String[] args) {
		/*
		 *  CreditCard : 클래스명이자 데이터타입
		 *  c : 변수, 참조변수, 객체를 참조하는 변수 (주소값이 들어가 있다) 
		 *  CreditCard() : 생성자 Constructor 
		 */
		
		/*
		 * CreditCard클래스에 매개변수가 명시된 생성자가 있으므로
		 * 데이터를 할당해야 한다
		 * CreditCard c = new CreditCard(); // error
		 */
		CreditCard c = new CreditCard("손흥민 1등급");
		System.out.println(c.getInfo());
		
	}
}
