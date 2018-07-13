package kosta.day5.array.step4;

// reference data type의 data를 저장하는 배열
public class TestRefArray2 {

	public static void main(String[] args) {
		
		Person[] p = {new Person("박보검",22), new Person("아이유",26),new Person("손흥민",24)};
		
		// p 배열 요소 중 나이가 25세 이하인 요소의 name과 age를 출력한다. 
		
		for(int i=0; i<p.length; i++) {
			int age = p[i].getAge(); 
			if(age <= 25)
				System.out.println(p[i].getName()+" : "+p[i].getAge());
		}
		
		System.out.println("**************************");
		
		
		// 배열 요소의 age에 10을 더하기 
		for(int i=0; i<p.length; i++) {
			int age = p[i].getAge(); 
			p[i].setAge(age+10); 
			System.out.println(p[i].getName()+" : "+p[i].getAge());
		}
	}
}
