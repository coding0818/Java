package ch02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/26
 * 이름 : 박가영
 * 내용 : P70 형변환 실습하기
 */
public class P070 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초를 입력하시오:");
		int time = sc.nextInt();
		int sec = (time%60); //나머지 연산자를 이용한다.
		int min = (time/60); //정수 나눗셈을 이용한다.
		
		System.out.println(time+"초는 "+min+"분 "+sec+"초입니다.");
	}

}
