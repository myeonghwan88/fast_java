package ch01;

public class Customer {

//	private int customerID;
//	private String customerName;
//	private String customerGrade;
// 상속 받아 사용하기에 protected로 변경
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;

//  vip를 따로 빼어서 주석
//	String agentID;
//	double saleRatio;

	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + 
				"이며, 보너스 포인트는" + bonusPoint + "입니다.";		
	}

}
