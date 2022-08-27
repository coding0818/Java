package ch04;
/*
 * 날짜 : 2022/08/27
 * 이름 : 박가영
 * 내용 : P150 DeskLamp 클래스 작성하고 객체 생성해보기
 */
public class P150 {
	public static void main(String[] args) {
		//객체를 생성하려면 new 예약어를 사용한다.
		DeskLamp myLamp = new DeskLamp();
		
		//객체의 메소드를 호출하려면 도트 연산자인 .을 사용한다.
		myLamp.turnOn();
		System.out.println(myLamp);
		myLamp.turnOff();
		System.out.println(myLamp);
	}

}
