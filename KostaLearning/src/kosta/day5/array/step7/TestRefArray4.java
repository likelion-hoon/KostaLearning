package kosta.day5.array.step7;

public class TestRefArray4 {

	public static void main(String[] args) {
		
		Employee e[] = new Employee[4]; 
		e[0] = new Employee("������", "�Ǳ�", 400); 
		e[1] = new Employee("�ں���", "����", 300); 
		e[2] = new Employee("�ֿ��", "�Ǳ�", 600); 
		e[3] = new Employee("��ȣ��", "�Ǳ�", 700); 
		
		EmployeeService service = new EmployeeService(); 
		
		String address = "�Ǳ�"; 
		
		System.out.println("**** ù ��° ���� ****");
		service.printEmployeeInfoByAddress(e,address); 
	
		
		/*
		 *  ������ �Ǳ� 400
		 *  �ֿ�� �Ǳ� 600
		 * 
		 */
		
		int salary=500; 
		System.out.println("\n\n **** �� ��° ���� ****");
		// address �� ��ġ�ϰ� salary �̻��� �޴� ����� ���
		service.printEmployeeInfoByAddressAndSalary(e, address, salary);
	}
}
