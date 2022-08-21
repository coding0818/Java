package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/21
 * 이름 : 박가영
 * 내용 : 2단계 6번 문제
 */
public class _06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(A <= 23 && A >= 0 && B >= 0 && B <= 59 && C >= 0 && C <= 1000);
		
		if (C % 60 == 0) {
			if((A + ( C / 60 ))>=24) {
			A = A + ( C / 60 ) - 24;
			}
		}
		
		if (C % 60 != 0) {
			
			A = A + ( C / 60 );
			B = B + ( B % 60 );
		}
		
		System.out.printf("%d %d", A, B);
	}

}
