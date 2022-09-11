package ch08;
/*
 * 날짜 : 2022/09/11
 * 이름 : 박가영
 * 내용 : P264 고객 관리 프로그램 완성하기(3)
 */
public class P264 {
	public static void main(String[] args) {
		P262 customerLee = new P262();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		P262 customerKim = new P263(10020, "김유신", 12345);
		customerKim.bonusPoint = 1000;
		
		System.out.println(customerKim.showCustomerInfo());
		System.out.println("=======할인율과 보너스 포인트 계산======");
		
		int price = 10000;
		int leePrice = customerLee.calcPrice(price);
		int kimPrice = customerKim.calcPrice(price);
		
		System.out.println(customerLee.getCustomerName()+" 님이 "+leePrice+"원 지불하셨습니다.");
	    System.out.println(customerLee.showCustomerInfo());
	    System.out.println(customerKim.getCustomerName()+" 님이 "+kimPrice+"원 지불하셨습니다.");
	    System.out.println(customerKim.showCustomerInfo());
	}

}
