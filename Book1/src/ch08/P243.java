package ch08;
/*
 * 날짜 : 2022/09/09
 * 이름 : 박가영
 * 내용 : P243 하위 클래스 생성하기
 */
public class P243 {
	public static void main(String[] args) {
				
		P242 customerKim = new P242();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint=10000;
		System.out.println(customerKim.showCustomerInfo());
	}

}
