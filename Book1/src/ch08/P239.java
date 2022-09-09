package ch08;
/*
 * 날짜 : 2022/09/09
 * 이름 : 박가영
 * 내용 : P239 상속 클래스 테스트하기
 */
public class P239 {
	public static void main(String[] args) {
		P238 customerLee = new P238();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint=1000;
		System.out.println(customerLee.showCustomerInfo());
		
		P237 customerKim = new P237();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint=10000;
		System.out.println(customerKim.showCustomerInfo());
	}

}
