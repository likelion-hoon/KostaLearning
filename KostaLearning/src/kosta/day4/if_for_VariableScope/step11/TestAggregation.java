package kosta.day4.if_for_VariableScope.step11;


/*
 *  object relation 
 *  : aggregation (has a)
 *  ����� ����Ʈ���� �����Ͽ� ����ϴ� 
 */


public class TestAggregation {

	public static void main(String[] args) {
		
		Person p = new Person("���¸�", new SmartPhone("������9", "�Ｚ"));
		System.out.println(p.getName());
		System.out.println(p.getSmartPhone().getModel()); // ������9
		System.out.println(p.getSmartPhone().getMarker()); // �Ｚ
	}
}
