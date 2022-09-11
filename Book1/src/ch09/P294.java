package ch09;
/*
 * 날짜 : 2022/09/11
 * 이름 : 박가영
 * 내용 : P294 추상 클래스와 템플릿 메서드
 */
public class P294 {
	public static void main(String[] args) {
		System.out.println("===자율 주행하는 자동차===");
		P291 myCar = new P292();
		myCar.run();
		
		System.out.println("===사람이 운전하는 자동차===");
		P291 hisCar = new P293();
		hisCar.run();
	}

}
