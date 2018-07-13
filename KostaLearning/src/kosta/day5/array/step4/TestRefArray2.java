package kosta.day5.array.step4;

// reference data type�� data�� �����ϴ� �迭
public class TestRefArray2 {

	public static void main(String[] args) {
		
		Person[] p = {new Person("�ں���",22), new Person("������",26),new Person("�����",24)};
		
		// p �迭 ��� �� ���̰� 25�� ������ ����� name�� age�� ����Ѵ�. 
		
		for(int i=0; i<p.length; i++) {
			int age = p[i].getAge(); 
			if(age <= 25)
				System.out.println(p[i].getName()+" : "+p[i].getAge());
		}
		
		System.out.println("**************************");
		
		
		// �迭 ����� age�� 10�� ���ϱ� 
		for(int i=0; i<p.length; i++) {
			int age = p[i].getAge(); 
			p[i].setAge(age+10); 
			System.out.println(p[i].getName()+" : "+p[i].getAge());
		}
	}
}
