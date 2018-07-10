package kosta.day3.dataType.step1.test;

import kosta.day3.dataType.step1.model.Student;
import kosta.day3.dataType.step2.Person;

public class TestImport {

	public static void main(String[] args) {
		Student s = new Student(); 
		s.study();
		
		Person p = new Person(); 
		p.setName("æ∆¿Ã¿Ø");
		System.out.println(p.getName());
	}
}
