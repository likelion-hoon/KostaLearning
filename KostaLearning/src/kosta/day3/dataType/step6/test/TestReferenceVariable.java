package kosta.day3.dataType.step6.test;

import kosta.day3.dataType.step6.model.Friend;

// ���������� ���� ���� 
public class TestReferenceVariable {

	public static void main(String[] args) {
		/*
		 * Friend : reference data type 
		 * f : reference variable 
		 * Friend() : Constructor ������ 
		 */
		
		Friend f = new Friend("������"); 
		System.out.println(f.getName());
		
		// �ν��Ͻ� ������ ������� �ʱ�ȭ�� 1�� ��� 
		System.out.println(f.getAge());
		
		// int���� �⺻�� 0 ���
		System.out.println(f.getMoney());
		
		// String���� �⺻���� null ���
		System.out.println(f.getAddress());
	}
}
