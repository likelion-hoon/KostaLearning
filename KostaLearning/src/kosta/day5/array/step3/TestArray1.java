package kosta.day5.array.step3;

/*
 * 	Primitive Data Type의 data를 저장하는 배열
 */

public class TestArray1 {
	public static void main(String[] args) {
		// 1. 배열 선언
		int[] age; 
		
		// 2. 배열 생성
		age = new int[3];  // heap영역에 배열 객체 생성(3개의 공간) 
		
		// 배열의 idx는 0부터 이다. 
		age[0] = 26; 
		age[1] = 30; 
		age[2] = 18; 
		
		for(int i : age) {
			System.out.println(i);
		}
		
	}
}
