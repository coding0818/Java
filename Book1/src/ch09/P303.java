package ch09;
/*
 * 날짜 : 2022/09/11
 * 이름 : 박가영
 * 내용 : P303 테스트 프로그램 실행하기
 */
public class P303 {
	public static void main(String[] args) {
		P298 player = new P298();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}

}
