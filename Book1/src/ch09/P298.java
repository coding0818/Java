package ch09;
/*
 * 날짜 : 2022/09/11
 * 이름 : 박가영
 * 내용 : P298 Player 클래스 구현하기
 */
public class P298 {
	private PlayerLevel level;
	
	public P298() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	public PlayerLevel getLevel() {
		return level;
	}
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	public void play(int count) {
		level.go(count);
	}

}
