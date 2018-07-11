package kosta.day2.OOPBasicSyntax.step1;

/*
 * Person class를 test 하는 클래스 
 * Person 클래스를 이용해 Person 객체를 생성하고 
 * Person class의 변수 영역에 데이터를 할당하는 테스트 및 
 * 변수에 저장된 데이터를 출력해보는 예제 
 */

public class TestPerson {

 /*	
 * 메인 메서드 : 프로그램의 시작점(Entry Point)
 * 실행을 위해서 반드시 필요하다 
 */
	public static void main(String[] args) {
		// Person class를 이용해 객체object를 생성
		/*
		 * Person : class name, data type 
		 * p : variable 변수, 객체를 참조하는 변수 
		 * = : assign 할당 or 대입 
		 * new : 객체 생성시 사용하는 자바 키워드 
		 * Person() : 생성자 constructor
		 */
		
		Person p = new Person(); 
		// 위 라인이 jvm에 의해 실행되면 Person 객체가 
		// 메모리에 적재된다. 
		// p 객체의 변수 영역에 데이터를 할당해본다. 
		p.name = "손흥민";
		p.age = 27; 
		
		System.out.println("이름: "+p.name+", 나이: "+p.age);
		
		Person p2 = new Person(); 
		p2.name = "아이유"; 
		p2.age = 26; 
		
		System.out.println("이름: "+p2.name+", 나이: "+p2.age);
		
		p.eat();
		p2.eat();
		p.sleep(7);
		p2.sleep(8);
		p.eat(); 
		p.study("java", 8);
		
		System.out.println(p.getDetailInfo());
		System.out.println(p2.getDetailInfo());
		
	}
}
