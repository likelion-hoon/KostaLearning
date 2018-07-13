package kosta.day5.array.step7;

public class TestRefArray4 {

	public static void main(String[] args) {
		
		Employee e[] = new Employee[4]; 
		e[0] = new Employee("아이유", "판교", 400); 
		e[1] = new Employee("박보검", "종로", 300); 
		e[2] = new Employee("최요셉", "판교", 600); 
		e[3] = new Employee("강호동", "판교", 700); 
		
		EmployeeService service = new EmployeeService(); 
		
		String address = "판교"; 
		
		System.out.println("**** 첫 번째 문제 ****");
		service.printEmployeeInfoByAddress(e,address); 
	
		
		/*
		 *  아이유 판교 400
		 *  최요셉 판교 600
		 * 
		 */
		
		int salary=500; 
		System.out.println("\n\n **** 두 번째 문제 ****");
		// address 와 일치하고 salary 이상을 받는 사원을 출력
		service.printEmployeeInfoByAddressAndSalary(e, address, salary);
	}
}
