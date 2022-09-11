package ch08;
/*
 * 날짜 : 2022/09/11
 * 이름 : 박가영
 * 내용 : P262 고객 관리 프로그램 완성하기(1)
 */
public class P262 {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public P262() {
		initCustomer();
	} 
	public P262(int customerID, String customerName) {
    	this.customerID = customerID;
    	this.customerName = customerName;
    	initCustomer();
    }
	
	private void initCustomer() {
		customerGrade = "SILVER";
    	bonusRatio = 0.01;
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	public String showCustomerInfo() {
		return customerName + "님의 등급은 "+customerGrade+"이며, 보너스 포인트는"+bonusPoint+"입니다.";
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

}
