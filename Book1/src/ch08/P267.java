package ch08;
/*
 * 날짜 : 2022/09/11
 * 이름 : 박가영
 * 내용 : P267 새로운 고객 등급 추가하기
 */
public class P267 extends P262{
	double saleRatio;
	
	public P267(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price - (int)(price*saleRatio);
	}

}
