package kosta.day5.array.step3;

public class TestArray3 {
	public static void main(String[] args) {

		// �迭 ����, ����, �Ҵ��� ���ÿ�
		int bonus[] = { 200, 300, 500 };
		ArrayService service = new ArrayService();
		double avgBonus = Math.round(service.getAvgBonus(bonus) * 100) / 100.0;
		System.out.println("���ʽ� ��� : " + avgBonus + "����");

	}
}
