package kosta.day3.dataType.step2.test;

import kosta.day3.dataType.step2.model.CreditCard;

/*
 *  �����ڸ� �����ϰ� �׽�Ʈ�ϴ� ���� 
 */

public class TestConstructor {

	public static void main(String[] args) {
		/*
		 *  CreditCard : Ŭ���������� ������Ÿ��
		 *  c : ����, ��������, ��ü�� �����ϴ� ���� (�ּҰ��� �� �ִ�) 
		 *  CreditCard() : ������ Constructor 
		 */
		
		/*
		 * CreditCardŬ������ �Ű������� ��õ� �����ڰ� �����Ƿ�
		 * �����͸� �Ҵ��ؾ� �Ѵ�
		 * CreditCard c = new CreditCard(); // error
		 */
		CreditCard c = new CreditCard("����� 1���");
		System.out.println(c.getInfo());
		
	}
}
