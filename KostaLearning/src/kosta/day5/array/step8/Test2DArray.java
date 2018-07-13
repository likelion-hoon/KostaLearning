package kosta.day5.array.step8;

public class Test2DArray {

	public static void main(String[] args) {
		
		int[][] rain; 
		rain = new int[3][12]; 
		
		System.out.println(rain.length);
		System.out.println(rain[0].length);
		System.out.println("*****************");
		
		// 판교중학교 1학년 3반, 2학년 2반, 3학년 4반을 저장하자
		int ms[][]; 
		ms = new int[3][]; 
		ms[0] = new int[3]; 
		ms[1] = new int[2]; 
		ms[2] = new int[4]; 
		
		// 마지막 학년의 마지막 반의 정원수를 20명으로 저장해본다. 
		ms[ms.length-1][ms[2].length-1] = 20; 
		
		
		
		
		
	}
}
