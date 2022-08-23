package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/23
 * 이름 : 박가영
 * 내용 : 3단계 8번 문제
 */
public class _08 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		for (int i = 1; i <= N; i++) {
			for(int k = 1; k <= i; k++) {
				
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
