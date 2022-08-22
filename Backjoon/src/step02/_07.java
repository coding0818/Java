package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/22
 * 이름 : 박가영
 * 내용 : 2단계 7번 문제
 */
public class _07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int P;
		
		if (A >= 1 && A <= 6 && B >= 1 && B <= 6 && C >= 1 && C <= 6) {
		
		if (A == B && B == C) {
			P = 10000 + A * 1000;
			System.out.printf("%d", P);
		}
		else if (A == B && B != C) {
			P = 1000 + A * 100;
			System.out.printf("%d", P);
		}
		else if (B == C && A != C) {
			P = 1000 + B * 100;
			System.out.printf("%d", P);
		}
		else if (A == C && B != C) {
			P = 1000 + A * 100;
			System.out.printf("%d", P);
		}
		else if (A != B && B != C && C != A) {
			if (A > B && A > C) {
				P = A * 100;
				System.out.printf("%d", P);
			}
			else if(B > A && B > C) {
				P = B * 100;
				System.out.printf("%d", P);
			}
			else if(C > A && C > B) {
				P = C * 100;
				System.out.printf("%d", P);
			}
			
		}
		
		}
	}
}
