package kosta.day4.if_for_VariableScope.step10;

// Person use a RentCar
public class Person {
	
	private String name; 
	
	public Person(String name) {
		this.name = name; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void tour() {
		// RentCar는 일시적으로 사용 후 필요가 없으므로 
		// 지역변수(local variable)로 처리한다. 
		
		RentCar car = new RentCar("소나타","검정"); 
		System.out.println(name+" "+car.getColor()+" "+car.getModel()+" 렌트카로 여행하다.");
		
	}
	
	
}
