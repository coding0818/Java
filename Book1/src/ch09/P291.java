package ch09;
/*
 * 날짜 : 2022/09/11
 * 이름 : 박가영
 * 내용 : P291 추상 클래스와 템플릿 메서드
 */
public abstract class P291 {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	final public void run() { //템플릿 메서드
		startCar();
		drive();
		stop();
		turnOff();
	}

}
