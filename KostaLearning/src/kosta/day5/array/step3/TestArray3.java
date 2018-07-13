package kosta.day5.array.step3;

public class TestArray3 {
	public static void main(String[] args) {

		// 배열 선언, 생성, 할당을 동시에
		int bonus[] = { 200, 300, 500 };
		ArrayService service = new ArrayService();
		double avgBonus = Math.round(service.getAvgBonus(bonus) * 100) / 100.0;
		System.out.println("보너스 평균 : " + avgBonus + "만원");

	}
}
