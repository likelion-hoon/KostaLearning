package kosta.day5.array.step2;

public class Car {
	
	private String model; 
	private Engine engine; 
	
	/*
	 * Car�� Engine�� composition �����̹Ƿ� 
	 * life cycle �����ֱ⸦ �Բ� �ϱ� ���� 
	 * Car ���� �� �ݵ�� Engine�� ������ �� 
	 * Car ��ü�� �����ǵ��� ó���Ѵ�. 
	 */
	
	public Car(String model) {
		this.model = model; 
		this.engine = new Engine("L4","2000"); 
	}

	public String getModel() {
		return model;
	}

	public Engine getEngine() {
		return engine;
	}
	
}
