package kosta.day5.array.step9;

class Animal {
	String eye="눈 두개"; 
	
	public void eat() {
		System.out.println("먹다");
	}
}

class Person extends Animal {
	public void study() {
		System.out.println("공부하다");
	}
}
class Dog extends Animal {
	public void bark() {
		System.out.println("멍멍");
	}
}

public class TestInheritance {
	public static void main(String[] args) {
		Person p = new Person(); 
		System.out.println(p.eye);
		p.eat(); // 상속 받았으므로 사용가능
		p.study(); // 자신의 메서드이므로 사용가능
	}
}
