package kosta.day5.array.step7;

public class EmployeeService {

	public void printEmployeeInfoByAddress(Employee e[], String address) {
		
		for(int i=0; i<e.length; i++) {
			// equals 메서드를 이용해 문자열 비교 
			if(address.equals(e[i].getAddress())) {
				System.out.println(e[i].getName()+" "+e[i].getAddress()+" "+e[i].getSalary());
			}
		}
	}

	public void printEmployeeInfoByAddressAndSalary(Employee[] e, String address, int salary) {
		
		String eAddress = null; 
		int eSalary = 0; 
		
		for(int i=0; i<e.length; i++) {
			eAddress = e[i].getAddress();
			eSalary = e[i].getSalary(); 
			
			if(address.equals(eAddress) && eSalary >= salary) 
				System.out.println(e[i].getName()+" "+e[i].getAddress()+" "+e[i].getSalary());

		}
	}
}
