package ch08;
/*
 * 날짜 : 2022/09/06
 * 이름 : 박가영
 * 내용 : P234 Customer 클래스 구현하기
 */
public class P234 {
	private int customerID;
	private String customerName;
	private String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public P234() {
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
}
