package suhang;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/07
 * 이름 : 박가영
 * 내용 : 수행평가 문제2번
 */
public class _02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int k=1; k<=n; k++) {
			for(int i = n-1; i >= k; i--) {
				System.out.print(" ");
			    }
			for(int j = 1; j <= k; j++) {
				System.out.print("*");
			    }
			System.out.println();
		}
	}

}
