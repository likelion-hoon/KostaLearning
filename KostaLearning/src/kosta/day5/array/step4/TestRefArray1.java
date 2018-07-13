package kosta.day5.array.step4;

import kosta.day5.array.step1.Book;

// reference data type의 data를 저장하는 배열
public class TestRefArray1 {

	public static void main(String[] args) {
		// 1. 배열 선언
		Book book[]; 
		
		// 2. 배열 생성
		book = new Book[3]; 
		System.out.println(book[0]); // null
		
		// 3. 배열 요소 할당
		book[0] = new Book("역사의 역사", "유시민"); 
		book[1] = new Book("총균쇠", "다이아몬드");
		book[2] = new Book("자바의 정석", "남궁성");
		
		System.out.println(book[0].getTitle());
		
		
		for(int i=0; i<book.length; i++) 
			System.out.print(book[i].getWriter()+" ");
		
		Book bo[] = {new Book("개미","베르나르 베르베르"), new Book("고구려","김진명")};
		
		for(int i=0; i<bo.length; i++) {
			
		}
			
		
	}
}
