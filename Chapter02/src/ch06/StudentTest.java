package ch06;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student(); // default 생성자 사용
		System.out.println(studentLee.showStudentInfo());
		
		Student studentKim = new Student(123456, "KIM", 3); // 만든 생성자 사용
		System.out.println(studentKim.showStudentInfo());
	}
}
