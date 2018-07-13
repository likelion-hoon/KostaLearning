package kosta.day5.array.step5;

import kosta.day5.array.step4.Person;

public class PersonService {
	public void printMaxAge(Person[] p) {
		
		int max = Integer.MIN_VALUE; 
		int age = 0;
		
		for(int i=0; i<p.length; i++) {
			age = p[i].getAge(); 
			max = max < age ? age : max; 
		}
		
		System.out.println(max);
	}
	
	public Person getPersonByMinAge(Person[] p) {
		
		Person ans = null; 
		
		int min = Integer.MAX_VALUE; 
		int age = 0; 
		for(int i=0; i<p.length; i++) {
			age = p[i].getAge();
			min = min > age ? age : min; 
		}
		
		for(int i=0; i<p.length; i++) {
			if(p[i].getAge()==min) {
				ans = p[i];
			}
		}
		
		return ans; 
	}
}
