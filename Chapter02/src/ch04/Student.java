package ch04;

public class Student {
	
	public int studentID;
	public String studendName;
	public String address;
	
	public void showStudentInfo() {
		System.out.println(studentID + "학번 학색의 이름은 " + studendName + "이고, 주소는 " + address + "입니다.");
	}
	
	public String getStudendName() {
		return studendName;
	}
	
	public void setStudendName(String name) {
		studendName = name;
	}
}
