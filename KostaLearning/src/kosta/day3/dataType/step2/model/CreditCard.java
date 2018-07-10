package kosta.day3.dataType.step2.model;

public class CreditCard {
	
	/*
	 *  생성자 Constructor를 명시하지 않으면
	 *  컴파일시에 자동 삽입된다. 
	 *  생성자를 명시하면 삽입하지 않는다. 
	 *  생성자는 클래스명과 동일해야 한다. 
	 */
	
	/*
	 *  생성자를 명시하는 주된 이유는 
	 *  객체 생성 시점에 필요한 정보를 전달 받기 위해 명시한다. 
	 *  (ex : 신용카드 객체 - 개인정보 필수) 
	 */
	private String info; 
	public CreditCard(String info) {
		System.out.println("생성자 실행");
		// 만약 info 개인정보가 충족되지 않을 때는
		// exception을 발생시켜 객체 생성을 하지 않을 수 있다.
		this.info = info; 
	}
	
	public String getInfo() {
		return this.info; 
	}
	
}
