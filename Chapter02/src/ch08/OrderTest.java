package ch08;

import java.util.Scanner;

public class OrderTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("주문 접수 번호 : ");
		Long orderNum = scanner.nextLong();
		
		System.out.print("주문 핸드폰 번호 : ");
		String orderTelNum = scanner.next();
		
		scanner.nextLine();
		
		System.out.print("주문 집 주소 : ");
		String orderAddress = scanner.nextLine();
		
		System.out.print("주문 날짜 : ");
		int orderDate = scanner.nextInt();
		
		System.out.print("주문 시간 : ");
		int orderTime = scanner.nextInt();
		
		System.out.print("주문 가격 : ");
		int orderPrice = scanner.nextInt();
		
		System.out.print("메뉴 번호 : ");
		String menuNum = scanner.next();
		
		Order order = new Order(orderNum, orderTelNum, orderAddress, orderDate, orderTime, orderPrice, menuNum);
		System.out.println(order.showOrder());
		
		scanner.close();
	}
}
