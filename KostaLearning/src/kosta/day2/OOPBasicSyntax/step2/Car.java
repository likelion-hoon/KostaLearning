package kosta.day2.OOPBasicSyntax.step2;

public class Car {
	
	public String name; 
	public int speed; 
	public String color; 
	
	public Car() {
		this.color = "����";
	}
		
	public void go() {
		System.out.println("�ڵ����� ����");
	}
	
	public void run(String name, int speed) {
		this.name = name; 
		this.speed = speed; 
		System.out.println(this.name+"�� "+this.speed+"km�� �޸���.");
	}
	
	public String getInfo() {
		return "��: "+this.name+", ����: "+this.color;
	}
}
