package kosta.day4.if_for_VariableScope.step11;

public class Person {
	
	// SmartPhone�� ���������� ����ؾ� �ϹǷ� 
	// instance variable�� ó���Ѵ�. 
	private String name;
	private SmartPhone smartPhone; // has a

	public Person(String name, SmartPhone smartPhone) {
		this.name = name;
		this.smartPhone = smartPhone;
	}

	public String getName() {
		return name;
	}

	public SmartPhone getSmartPhone() {
		return smartPhone;
	}

}
