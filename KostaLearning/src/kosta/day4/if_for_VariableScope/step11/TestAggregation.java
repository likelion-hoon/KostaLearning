package kosta.day4.if_for_VariableScope.step11;


/*
 *  object relation 
 *  : aggregation (has a)
 *  사람이 스마트폰을 소유하여 사용하다 
 */


public class TestAggregation {

	public static void main(String[] args) {
		
		Person p = new Person("김태리", new SmartPhone("갤럭시9", "삼성"));
		System.out.println(p.getName());
		System.out.println(p.getSmartPhone().getModel()); // 갤럭시9
		System.out.println(p.getSmartPhone().getMarker()); // 삼성
	}
}
