package kosta.day5.array.step3;

public class ArrayService {

	public double getAvgBonus(int[] arr) {
		
		double sum = 0; 
		for(int i=0; i<arr.length; i++) {
			sum += arr[i]; 
		}
		
		return sum / arr.length; 
	}
}
