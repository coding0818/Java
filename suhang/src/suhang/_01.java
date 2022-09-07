package suhang;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/07
 * 이름 : 박가영
 * 내용 : 수행평가 문제1번
 */
public class _01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
