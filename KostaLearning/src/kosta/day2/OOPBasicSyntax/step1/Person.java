/*
 *  패키지 선언부 : class를 디렉토리별로 분류해서 관리 
 * 				    패키지는 소문자로 명시 
 * 
 */

package kosta.day2.OOPBasicSyntax.step1;

/*
 *  class 선언부 : class는 object의 설계도 
 *  public : 접근 제어자 access modifier
 *           가장 넓은 범위의 접근 제어자 
 *           접근 제어자의 종류
 *           public > protected > default > private 
 *           
 *           public : 어디서나 접근 가능
 *           protected : 패키지 내에서 접근가능
 *           			 단, 상속관계시에는 다른 패키지에서도 접근 가능
 *           default : 동일한 패키지내에서만 접근가능 
 *           private : 다른 클래스에서 접근불가
 *           
 *           Person은 class명, 클래스명은 대문자로 시작 
 *           합성어의 첫 글자는 대문자, 나머지는 소문자로 구성
 *           
 *           ex) MyHouse
 */

public class Person {
	
	/* 변수 (variable or attribute)를 선언 
	 * -> 변수는 객체의 속성 정보를 저장하기 위해 선언 
	 * public : 접근제어자, 어디서나 접근 가능
	 * String : 데이터 타입, 문자열 데이터를 저장하기 위한 타입
	 * name : 변수명, 소문자로 시작, 합성어의 첫글자는 대문자  
	 * ex) firstName
	*/
	public String name; 
	/*
	 * 변수 선언 : 객체의 속성 정보를 저장
	 * public : access modifier
	 * int : 데이터 타입, 정수형 데이터를 저장하기 위한 타입
	 * age : 변수명 
	 * 
	 */
	public int age; 
	/*
		메서드 : 객체의 기능을 정의
		public : 접근 제어자 
		void : 리턴값이 없을 때 명시하는 자바키워드 
		eat : 메소드 명, 변수명 규칙과 동일
			 소문자로 구성, 합성어의 첫글자는 대문자
			 ex) findMemberInfoById 
	*/
	public void eat() {
		System.out.println(this.name+"이(가) 먹는다.");
	}
	
	/*
	 *  int time : 메서드의 매개변수 
	 *  메서드를 호출한 측에서 전달한 데이터를 받기 위한 변수
	 *  void:메서드가 데이터를 리턴하지 않을 때 명시하는 키워드 
	 *  '이 메서드는 메서드가 없다'
	 */
	
	public void sleep(int time) {
		System.out.println(this.name+"님이 "+time+"시간 자다");
	}
	
	public void study(String subject, int time) {
		System.out.println(this.name+"님이 "+subject+"를 "+time+"시간 공부합니다.");
	}
	
	/*
	 *  String : 리턴타임 
	 */
	
	public String getDetailInfo() {
		return "이름:"+this.name+", 나이:"+this.age;
	}
	
	
}
