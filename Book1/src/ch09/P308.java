package ch09;
/*
 * 날짜 : 2022/09/11
 * 이름 : 박가영
 * 내용 : P308 테스트 코드(최종 실행 파일)부터 만들기
 */
public class P308 {
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
