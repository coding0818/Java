package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/21
 * 이름 : 박가영
 * 내용 : 2단계 2번 시험 점수를 성적으로 바꾸는 문제
 */
public class _02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int S = sc.nextInt();
		
		if(S <= 100 && S >= 0) {
		if(S >= 90 && S <= 100) {
			System.out.println("A");
		}
		if(S >= 80 && S <= 89) {
			System.out.println("B");
		}
		if(S >= 70 && S <= 79) {
			System.out.println("C");
		}
		if(S >= 60 && S <= 69) {
			System.out.println("D");
		}
		if(S <= 59) {
			System.out.println("F");
		}
		}
	}

}
