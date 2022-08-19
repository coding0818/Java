package ch03;
/*
 * 날짜 : 2022/08/18
 * 이름 : 박가영
 * 내용 : 증가 감소 연사자를 사용하여 값 연산하기
 */
public class P75 {
	public static void main(String[] args) {
		int gameScore = 150;
		
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);
		
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);
	}

}
