package ch06;

public class Student {

	public int studentNumber;
	public String studentName;
	public int grade;
	
	// default 생성자 생성 (기본으로 만들어지나 아래와 같이 동시에 사용할 경우 따로 써줘야 함
	public Student() {}
	
	// 생성자 생성
	public Student(int studentNumber, String studentName, int grade) {

		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		
		return studentName + "학생의 학번은" + studentNumber + "이고," + grade + "학년 입니다.";
	}
}
