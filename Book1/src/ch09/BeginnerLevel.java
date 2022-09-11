package ch09;
/*
 * 날짜 : 2022/09/11
 * 이름 : 박가영
 * 내용 : P300 초보자 레벨 클래스 구현하기
 */
public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("Jump할 줄 모르지롱.");
		
	}

	@Override
	public void turn() {
		System.out.println("Turn할 줄 모르지롱.");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*****초보자 레벨입니다.*****");
		
	}

}
