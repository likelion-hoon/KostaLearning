package kosta.day3.dataType.step2.model;

public class CreditCard {
	
	/*
	 *  ������ Constructor�� ������� ������
	 *  �����Ͻÿ� �ڵ� ���Եȴ�. 
	 *  �����ڸ� ����ϸ� �������� �ʴ´�. 
	 *  �����ڴ� Ŭ������� �����ؾ� �Ѵ�. 
	 */
	
	/*
	 *  �����ڸ� ����ϴ� �ֵ� ������ 
	 *  ��ü ���� ������ �ʿ��� ������ ���� �ޱ� ���� ����Ѵ�. 
	 *  (ex : �ſ�ī�� ��ü - �������� �ʼ�) 
	 */
	private String info; 
	public CreditCard(String info) {
		System.out.println("������ ����");
		// ���� info ���������� �������� ���� ����
		// exception�� �߻����� ��ü ������ ���� ���� �� �ִ�.
		this.info = info; 
	}
	
	public String getInfo() {
		return this.info; 
	}
	
}
