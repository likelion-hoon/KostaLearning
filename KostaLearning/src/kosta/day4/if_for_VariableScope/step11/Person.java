package kosta.day4.if_for_VariableScope.step11;

public class Person {
	
	// SmartPhone은 지속적으로 사용해야 하므로 
	// instance variable로 처리한다. 
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
