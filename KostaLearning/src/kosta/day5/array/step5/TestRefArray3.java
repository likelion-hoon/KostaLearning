package kosta.day5.array.step5;

import kosta.day5.array.step4.Person;

public class TestRefArray3 {

	public static void main(String[] args) {
		
		Person[] p = { new Person("박보검", 22), new Person("아이유", 26)
				,new Person("손흥민", 24), new Person("이효리",40) };
		
		PersonService service = new PersonService();  
		service.printMaxAge(p); // 40 
		
		/*
		 * 
		 */
		
		Person person = service.getPersonByMinAge(p); 
		System.out.println(person.getName()+" "+person.getAge());
		
	}
}
