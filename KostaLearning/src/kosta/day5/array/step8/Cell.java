package kosta.day5.array.step8;

public class Cell {
	
	private int number;

	public Cell() {
		System.out.println("������ �����˴ϴ�."); 
	}
	
	public Cell(int number) {
		this.setNumber(number); 
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
