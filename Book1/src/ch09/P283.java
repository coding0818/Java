package ch09;
/*
 * 날짜 : 2022/09/11
 * 이름 : 박가영
 * 내용 : P283 추상 클래스 구현하기
 */
public abstract class P283 {
	public abstract void display();
	public abstract void typing();
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

}
