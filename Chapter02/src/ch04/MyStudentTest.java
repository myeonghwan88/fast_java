package ch04;

public class MyStudentTest {

	public static void main(String[] args) {
		
		MyStudent studentLee = new MyStudent(); // studentLee : 인스턴스 
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		
		MyStudent studentKim = new MyStudent(); // studentKim : 인스턴스 
		studentKim.studentID = 54321;
		studentKim.studentName = "Kim";
		String test = studentKim.getStudentName();
		System.out.println(test);
		studentKim.address = "경기도 성남시";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentKim);
		System.out.println(studentLee);
	}
}
