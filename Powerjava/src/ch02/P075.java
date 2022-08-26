package ch02;
/*
 * 날짜 : 2022/08/26
 * 이름 : 박가영
 * 내용 : P75 비트 이동 연산자 실습하기
 */
public class P075 {
	public static void main(String[] args) {
		int x = 0b00001101;
		int y = 0b00001010;
		
		System.out.print("x&y="+(x&y)+"   ");
		System.out.print("x|y"+(x|y)+"   ");
		System.out.print("x^y"+(x^y)+"   ");
		System.out.println("~x="+(~x)+"   ");
		System.out.print("x>>1="+(x>>1)+"   ");
		System.out.print("x<<1="+(x<<1)+"   ");
		System.out.println("x>>>1="+(x>>>1)+"   ");
	}

}
