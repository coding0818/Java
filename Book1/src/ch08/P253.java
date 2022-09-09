package ch08;
/*
 * 날짜 : 2022/09/09
 * 이름 : 박가영
 * 내용 : P253 클래스 형 변환과 재정의 메서드 호출하기
 */
public class P253 {
	public static void main(String[] args) {
		P245 vc = new P250(10030,"나몰라", 2000); // vip 고객 생성
		vc.bonusPoint=1000;
		
		System.out.println(vc.getCustomerName()+" 님이 지불해야 하는 금액은 "+vc.calcPrice(10000)+"원입니다.");
	}

}
