package ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		
//		System.out.println(employeeLee.serialNum);
		System.out.println(Employee.getSerialNum());
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
//		employeeKim.serialNum++;
		
		System.out.println(employeeLee.getEmployeeName() + "님의 사번은 "+ employeeLee.getEmployeeId() + "입니다.");
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은 "+ employeeKim.getEmployeeId() + "입니다.");
		
		
	}

}
