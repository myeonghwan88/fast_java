package ch08;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerYul = new GoldCustomer(10040, "이율곡");
		Customer customerKim = new VIPCustomer(10050, "김유신");
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerKim);
//		System.out.println("====== 고객 정보 출력 =======");
//		for (int i=0; i<customerList.size(); i++) {
//			System.out.println(customerList.get(i).showCustomerInfo());
//		}
		
//		for( Customer customer : customerList){
//			System.out.println(customer.showCustomerInfo());
//		}
//		System.out.println("====== 할인율과 보너스 포인트 계산 =======");
//		int price = 10000;
//		for(int i=0; i<customerList.size(); i++) {
//			int cost = customerList.get(i).calcPrice(price);
//			System.out.println(customerList.get(i).getCustomerName()+" 님이 " + cost + "원 지불하셨습니다.");
//			System.out.println(customerList.get(i).getCustomerName() +" 님의 현재 보너스 포인트는 " + customerList.get(i).bonusPoint + "점입니다.");
//		}
		
//		for( Customer customer : customerList){
//			int cost = customer.calcPrice(price);
//			System.out.println(customer.getCustomerName() +" 님이 " + cost + "원 지불하셨습니다.");
//			System.out.println(customer.getCustomerName() +" 님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
//		}
		
		if(customerHong instanceof GoldCustomer) {
			GoldCustomer vc = (GoldCustomer)customerHong;
			System.out.println(customerHong.showCustomerInfo());
		}
	}

}
