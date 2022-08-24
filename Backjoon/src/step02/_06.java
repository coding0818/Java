package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/21
 * 이름 : 박가영
 * 내용 : 2단계 6번 범위가 더 넓은 시간 계산 문제
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
			else {
			A = A + ( C / 60 );
			}
			
			System.out.printf("%d %d", A, B);
		}
		
		
		if (C % 60 != 0) {
			if((A + ( C / 60 ))>23 && (B + ( C % 60 )) < 60) {
			A = A + ( C / 60 ) - 24;
			B = B + ( C % 60 );
			}
			else if((A + ( C / 60 ))<=23 && (B + ( C % 60 )) < 60) {
			A = A + ( C / 60 );
			B = B + ( C % 60 );
			}
			else if((A + ( C / 60 ))<23 && (B + ( C % 60 )) >= 60) {
			A = A + ( C / 60 ) + 1;
			B = B + ( C % 60 ) - 60;
			}
			else if ((A + ( C / 60 ))>=23 && (B + ( C % 60 )) >= 60){
			A = A + ( C / 60 ) - 23;
			B = B + ( C % 60 ) - 60;
			}
			
			System.out.printf("%d %d", A, B);
		}
		
	}
}
