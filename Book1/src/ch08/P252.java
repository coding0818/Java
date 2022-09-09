package ch08;
/*
 * 날짜 : 2022/09/09
 * 이름 : 박가영
 * 내용 : P252 calcPrice() 테스트하기
 */
public class P252 {
	public static void main(String[] args) {
		P245 customerLee = new P245(10010,"이순신");
		customerLee.bonusPoint=1000;
		
		P250 customerKim = new P250(10020,"김유신",12345);
		customerKim.setCustomerID(10020);
		
		int price = 10000;
		System.out.println(customerLee.getCustomerName()+" 님이 지불해야 하는 금액은 "+customerLee.calcPrice(price)+"원입니다.");
		System.out.println(customerKim.getCustomerName()+" 님이 지불해야 하는 금액은 "+customerKim.calcPrice(price)+"원입니다.");
	}

}
