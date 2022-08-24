package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/21
 * 이름 : 박가영
 * 내용 : 2단계 1번 두 수를 비교한 결과를 출력하는 문제
 */
public class _01 {
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A <= 10000 && A >= -10000);
		if(B <= 10000 && B >= -10000);
		
		if(A > B) {
			System.out.println(">");
		}
		if (A < B) {
			System.out.println("<");
		}
		if(A == B) { 
			System.out.println("==");
		}
	}

}
