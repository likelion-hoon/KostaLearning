package kosta.day2.OOPBasicSyntax.step1;

/*
 * Person class�� test �ϴ� Ŭ���� 
 * Person Ŭ������ �̿��� Person ��ü�� �����ϰ� 
 * Person class�� ���� ������ �����͸� �Ҵ��ϴ� �׽�Ʈ �� 
 * ������ ����� �����͸� ����غ��� ���� 
 */

public class TestPerson {

 /*	
 * ���� �޼��� : ���α׷��� ������(Entry Point)
 * ������ ���ؼ� �ݵ�� �ʿ��ϴ� 
 */
	public static void main(String[] args) {
		// Person class�� �̿��� ��üobject�� ����
		/*
		 * Person : class name, data type 
		 * p : variable ����, ��ü�� �����ϴ� ���� 
		 * = : assign �Ҵ� or ���� 
		 * new : ��ü ������ ����ϴ� �ڹ� Ű���� 
		 * Person() : ������ constructor
		 */
		
		Person p = new Person(); 
		// �� ������ jvm�� ���� ����Ǹ� Person ��ü�� 
		// �޸𸮿� ����ȴ�. 
		// p ��ü�� ���� ������ �����͸� �Ҵ��غ���. 
		p.name = "�����";
		p.age = 27; 
		
		System.out.println("�̸�: "+p.name+", ����: "+p.age);
		
		Person p2 = new Person(); 
		p2.name = "������"; 
		p2.age = 26; 
		
		System.out.println("�̸�: "+p2.name+", ����: "+p2.age);
		
		p.eat();
		p2.eat();
		p.sleep(7);
		p2.sleep(8);
		p.eat(); 
		p.study("java", 8);
		
		System.out.println(p.getDetailInfo());
		System.out.println(p2.getDetailInfo());
		
	}
}
