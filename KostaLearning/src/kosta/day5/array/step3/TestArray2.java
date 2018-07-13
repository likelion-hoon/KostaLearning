package kosta.day5.array.step3;

/*
 * 	Primitive Data Type의 data를 저장하는 배열
 */

public class TestArray2 {
	public static void main(String[] args) {
		
		int salary[] = new int[4]; 
		int sum = 0; 
		
		salary[0] = 200;
		salary[1] = 400;
		salary[2] = 300;
		salary[3] = 600;
		
		for(int i : salary) {
			sum += i; 
		}
		
		System.out.println("월급의 총합 : " + sum);
	}
}
