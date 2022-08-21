package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/21
 * 이름 : 박가영
 * 내용 : 1단계 12번 문제
 */
public class _12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A >= 100 && A <= 999);
		if(B >= 100 && B <= 999);
		
		int C = (B % 100) % 10;
		int D = (B % 100) / 10;
		int E = B / 100;
		
		System.out.println(A * C);
		System.out.println(A * D);
		System.out.println(A * E);
		System.out.println(A * B);
	}

}
