package kosta.day5.array.step3;

/*
 * 	Primitive Data Type�� data�� �����ϴ� �迭
 */

public class TestArray1 {
	public static void main(String[] args) {
		// 1. �迭 ����
		int[] age; 
		
		// 2. �迭 ����
		age = new int[3];  // heap������ �迭 ��ü ����(3���� ����) 
		
		// �迭�� idx�� 0���� �̴�. 
		age[0] = 26; 
		age[1] = 30; 
		age[2] = 18; 
		
		for(int i : age) {
			System.out.println(i);
		}
		
	}
}
