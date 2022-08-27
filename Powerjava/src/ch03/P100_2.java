package ch03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/27
 * 이름 : 박가영
 * 내용 : P100 팩토리얼 계산하기
 */
public class P100_2 {
	public static void main(String[] args) {
		long fact = 1;
		int n;
			
		System.out.print("정수를 입력하시오:");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			fact = fact * i;
		}
		System.out.printf("%d!은 %d입니다.\n", n, fact);
	}

}
