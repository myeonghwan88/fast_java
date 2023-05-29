package ch18;

import java.util.Scanner;

public class DowhileTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;
		
		System.out.print("값 입력:");
//		input = scanner.nextInt();
		
//		while( input != 0 ) {
//			sum += input;
//			input = scanner.nextInt();
//		}
//		System.out.println(sum);
		do {
			input = scanner.nextInt();
			sum += input;
		} while ( input != 0 );
		System.out.println(sum);
		scanner.close();
	}

}
