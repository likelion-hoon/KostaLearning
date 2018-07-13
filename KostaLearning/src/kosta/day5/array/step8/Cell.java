package kosta.day5.array.step8;

public class Cell {
	
	private int number;

	public Cell() {
		System.out.println("세포가 생성됩니다."); 
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
