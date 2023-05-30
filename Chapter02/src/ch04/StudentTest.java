package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(); // studentLee : 인스턴스 
		
		studentLee.studentID = 12345;
		studentLee.setStudendName("Lee");
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(); // studentKim : 인스턴스 
		studentKim.studentID = 54321;
		studentKim.studendName = "Kim";
		studentKim.address = "경기도 성남시";
		
		studentKim.showStudentInfo();
	}
}
