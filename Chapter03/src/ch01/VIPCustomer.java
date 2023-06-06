package ch01;

public class VIPCustomer extends Customer{

//	Customer에서 상속 받아 쓰기에 필요 없다 
//	private int customerID;
//	private String customerName;
//	private String customerGrade;
//	int bonusPoint;
//	double bonusRatio;
	
	double salesRatio;
	private String agentID;
	
	public VIPCustomer() {		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";		
	}
	
	public String getAgentID() {
		return agentID;
	}
	
}
