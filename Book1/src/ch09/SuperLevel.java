package ch09;
/*
 * 날짜 : 2022/09/11
 * 이름 : 박가영
 * 내용 : P302 고급자 레벨 클래스 구현하기
 */
public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 jump합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("한 바퀴 돕니다.");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*****고급자 레벨입니다.*****");
	}

}
