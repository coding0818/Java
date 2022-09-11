package ch09;
/*
 * 날짜 : 2022/09/11
 * 이름 : 박가영
 * 내용 : P305 final 실습하기
 */
public class P305 {
	int num = 10;
	final int NUM = 100;
	public static void main(String[] args) {
		P305 cons = new P305();
		cons.num = 50;
		//cons.NUM = 200;
		
		System.out.println(cons.num);
		System.out.println(cons.NUM);
	}

}
