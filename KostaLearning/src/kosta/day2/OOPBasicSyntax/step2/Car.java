package kosta.day2.OOPBasicSyntax.step2;

public class Car {
	
	public String name; 
	public int speed; 
	public String color; 
	
	public Car() {
		this.color = "검정";
	}
		
	public void go() {
		System.out.println("자동차가 가다");
	}
	
	public void run(String name, int speed) {
		this.name = name; 
		this.speed = speed; 
		System.out.println(this.name+"가 "+this.speed+"km로 달리다.");
	}
	
	public String getInfo() {
		return "모델: "+this.name+", 색상: "+this.color;
	}
}
