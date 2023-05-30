package ch04;

public class MyStudentTest2 {

	public static void main(String[] args) {
		
		MyStudent studentCho = new MyStudent();
		
		studentCho.studentID = 12345;
		studentCho.setStudentName("CHO");
		studentCho.address = "서울시 송파구";
		
		studentCho.showStudentInfo();
		
		MyStudent studentJung = new MyStudent();
		
		studentJung.studentID = 54321;
		studentJung.studentName = "JUNG";
		studentJung.address = "성남시 분당구";
		
		studentJung.showStudentInfo();
	}
}
