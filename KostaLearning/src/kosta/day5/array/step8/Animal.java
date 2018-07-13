package kosta.day5.array.step8;

public class Animal extends Cell {
	
	private String name; 
	
	public Animal() {
		System.out.println("동물이 생성됩니다.");
	}

	public Animal(int number) {
		this.setNumber(number); 
	}
}
