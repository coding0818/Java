package ch08;
/*
 * 날짜 : 2022/09/09
 * 이름 : 박가영
 * 내용 : P257 클래스형에 기반하여 지불 금액 계산하기
 */
public class P257 {
	public static void main(String[] args) {
		int price = 10000;
		
		P245 customerLee = new P245(10010, "이순신");
		System.out.println(customerLee.getCustomerName()+"님이 지불해야 하는 금액은"+customerLee.calcPrice(price)+"원입니다.");
		
		P250 customerKim = new P250(10020, "김유신", 12345);
		System.out.println(customerKim.getCustomerName()+"님이 지불해야 하는 금액은"+customerKim.calcPrice(price)+"원입니다.");
	    
		P245 vc = new P250(10030, "나몰라", 2000);
		System.out.println(vc.getCustomerName()+"님이 지불해야 하는 금액은"+vc.calcPrice(10000)+"원입니다.");
	}

}
