package kosta.day5.array.step4;

import kosta.day5.array.step1.Book;

// reference data type�� data�� �����ϴ� �迭
public class TestRefArray1 {

	public static void main(String[] args) {
		// 1. �迭 ����
		Book book[]; 
		
		// 2. �迭 ����
		book = new Book[3]; 
		System.out.println(book[0]); // null
		
		// 3. �迭 ��� �Ҵ�
		book[0] = new Book("������ ����", "���ù�"); 
		book[1] = new Book("�ѱռ�", "���̾Ƹ��");
		book[2] = new Book("�ڹ��� ����", "���ü�");
		
		System.out.println(book[0].getTitle());
		
		
		for(int i=0; i<book.length; i++) 
			System.out.print(book[i].getWriter()+" ");
		
		Book bo[] = {new Book("����","�������� ��������"), new Book("����","������")};
		
		for(int i=0; i<bo.length; i++) {
			
		}
			
		
	}
}
