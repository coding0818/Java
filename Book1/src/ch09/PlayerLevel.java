package ch09;
/*
 * 날짜 : 2022/09/11
 * 이름 : 박가영
 * 내용 : P299 PlayerLevel 추상 클래스 구현하기
 */
public abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();

	final public void go(int count) {
		run();
		for(int i=0; i<count; i++) {
			jump();
		}
		turn();
	}
}
