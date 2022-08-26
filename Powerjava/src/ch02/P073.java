package ch02;
/*
 * 날짜 : 2022/08/26
 * 이름 : 박가영
 * 내용 : P73 비트 연산자 실습하기
 */
public class P073 {
	public static void main(String[] args) {
		byte status = 0b01101110;
		
		System.out.print("문열림 상태="+((status & 0b00000100)!=0));
	}

}
