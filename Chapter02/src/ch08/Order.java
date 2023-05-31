package ch08;

public class Order {

	public Long orderNum;
	public String orderTelNum;
	public String orderAddress;
	public int orderDate;
	public int orderTime;
	public int orderPrice;
	public String menuNum;
	
	public Order(Long orderNum, String orderTelNum, String orderAddress, int orderDate, int orderTime, int orderPrice, String menuNum) {
		this.orderNum = orderNum;
		this.orderTelNum = orderTelNum;
		this.orderAddress = orderAddress;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.menuNum = menuNum;	
	}
	
	public String showOrder() {
		return "=======================\n" + 
		"주문 접수 번호 : " + orderNum + "\n" + 
		"주문 핸드폰 번호 : " + orderTelNum + "\n" + 
		"주문 집 주소 : " + orderAddress + "\n" + 
		"주문 날짜 : " + orderDate + "\n" + 
		"주문 시간 : " + orderTime + "\n" + 
		"주문 가격 : " + orderPrice + "\n" + 
		"메뉴 번호 : " + menuNum + "\n";
	}
	
}
