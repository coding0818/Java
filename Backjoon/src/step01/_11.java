package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/21
 * 이름 : 박가영
 * 내용 : 1단계 11번 네 개의 계산식을 계산하는 문제
 */
public class _11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if (A >= 2 && A <= 10000);
		if (B >= 2 && B <= 10000);
		if (C >= 2 && C <= 10000);
		
		System.out.println((A + B) % C);
		System.out.println(((A % C) + (B % C)) % C);
		System.out.println((A * B) % C);
		System.out.println(((A % C) * (B % C)) % C);
		
		
	}

}
