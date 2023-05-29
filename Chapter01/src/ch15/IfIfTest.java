package ch15;
import java.util.Scanner;
public class IfIfTest {

	public static void main(String[] args) {
//		int age = 12;
		int charge;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이입력:");
		int age = scanner.nextInt();
		
		if (age < 8) {
			charge = 1000;
			System.out.println("미 취학 아동입니다.");
		}
		if (age < 14) {
			charge = 2000;
			System.out.println("초등학생 입니다.");
		} 
		if (age < 20) {
			charge = 2500;
			System.out.println("중, 고등학생 입니다.");
		}
		else {
			charge = 3000;
			System.out.println("일반인 입니다.");
		}
		
		System.out.println("if-if 입장료는 " + charge + "원 입니다.");
		scanner.close();
	}

}
