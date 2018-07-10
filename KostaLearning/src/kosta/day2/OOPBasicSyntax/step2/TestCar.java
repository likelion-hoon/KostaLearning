package kosta.day2.OOPBasicSyntax.step2;

// Test class를 보고 이에 대응되는 클래스와 메서드를 정의 해보는 예제 
public class TestCar {

	public static void main(String[] args) {
		Car c = new Car();  
		c.go(); // 자동차가 가다 
		c.run("소나타",100); 
		// 소나타가 100km로 달리다 로 출력된다 
		
		System.out.println(c.getInfo());
		// 모델: 소나타, 색상: 검정 
	}
}
