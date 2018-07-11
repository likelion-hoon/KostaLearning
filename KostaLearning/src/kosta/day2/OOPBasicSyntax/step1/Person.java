/*
 *  ��Ű�� ����� : class�� ���丮���� �з��ؼ� ���� 
 * 				    ��Ű���� �ҹ��ڷ� ��� 
 * 
 */

package kosta.day2.OOPBasicSyntax.step1;

/*
 *  class ����� : class�� object�� ���赵 
 *  public : ���� ������ access modifier
 *           ���� ���� ������ ���� ������ 
 *           ���� �������� ����
 *           public > protected > default > private 
 *           
 *           public : ��𼭳� ���� ����
 *           protected : ��Ű�� ������ ���ٰ���
 *           			 ��, ��Ӱ���ÿ��� �ٸ� ��Ű�������� ���� ����
 *           default : ������ ��Ű���������� ���ٰ��� 
 *           private : �ٸ� Ŭ�������� ���ٺҰ�
 *           
 *           Person�� class��, Ŭ�������� �빮�ڷ� ���� 
 *           �ռ����� ù ���ڴ� �빮��, �������� �ҹ��ڷ� ����
 *           
 *           ex) MyHouse
 */

public class Person {
	
	/* ���� (variable or attribute)�� ���� 
	 * -> ������ ��ü�� �Ӽ� ������ �����ϱ� ���� ���� 
	 * public : ����������, ��𼭳� ���� ����
	 * String : ������ Ÿ��, ���ڿ� �����͸� �����ϱ� ���� Ÿ��
	 * name : ������, �ҹ��ڷ� ����, �ռ����� ù���ڴ� �빮��  
	 * ex) firstName
	*/
	public String name; 
	/*
	 * ���� ���� : ��ü�� �Ӽ� ������ ����
	 * public : access modifier
	 * int : ������ Ÿ��, ������ �����͸� �����ϱ� ���� Ÿ��
	 * age : ������ 
	 * 
	 */
	public int age; 
	/*
		�޼��� : ��ü�� ����� ����
		public : ���� ������ 
		void : ���ϰ��� ���� �� ����ϴ� �ڹ�Ű���� 
		eat : �޼ҵ� ��, ������ ��Ģ�� ����
			 �ҹ��ڷ� ����, �ռ����� ù���ڴ� �빮��
			 ex) findMemberInfoById 
	*/
	public void eat() {
		System.out.println(this.name+"��(��) �Դ´�.");
	}
	
	/*
	 *  int time : �޼����� �Ű����� 
	 *  �޼��带 ȣ���� ������ ������ �����͸� �ޱ� ���� ����
	 *  void:�޼��尡 �����͸� �������� ���� �� ����ϴ� Ű���� 
	 *  '�� �޼���� �޼��尡 ����'
	 */
	
	public void sleep(int time) {
		System.out.println(this.name+"���� "+time+"�ð� �ڴ�");
	}
	
	public void study(String subject, int time) {
		System.out.println(this.name+"���� "+subject+"�� "+time+"�ð� �����մϴ�.");
	}
	
	/*
	 *  String : ����Ÿ�� 
	 */
	
	public String getDetailInfo() {
		return "�̸�:"+this.name+", ����:"+this.age;
	}
	
	
}
