package ch16;

public class Employee {
	
//	public static int serialNum = 1000;
	private static int serialNum = 1000; // 외부에서 변경하면 안되서 private로 변경

	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		serialNum++;
		employeeId = serialNum;
	}
	
	public static int getSerialNum() {
//		int i = 0; // (지역변수)지역변수는 상관 없다.
		
//		employeeName = "Lee"; // (인스턴스변수)static 메서드 안에서는 일반 멤버변수를 사용할 수 없다
		
		return serialNum;
	}
	public int getEmployeeId() {
//		serialNum = 1000; // 일반 메서드 안에서는 static 변수를 사용하는데 문제 없다. (메모리 문제)
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}	
}
