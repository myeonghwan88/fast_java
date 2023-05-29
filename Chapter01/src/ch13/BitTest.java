package ch13;

public class BitTest {

	public static void main(String[] args) {
		int num1 = 5; // 00000101
		int num2= 10; // 00001010
		
		System.out.println(num1 | num2); // 0|0 0반환 그외 1 00001111
		System.out.println(num1 & num2); // 1&1 1반환 그외 0 00000000 
		System.out.println(num1 ^ num2); // 두개 비트 다를때 1 반환 00001111
		System.out.println(~num1); // 11111010
		
		System.out.println(num1 << 2);
		System.out.println(num1 <<= 2); // 복합대입 연산자
		System.out.println(num1);
		System.out.println(num1 >> 1);
	}

}
