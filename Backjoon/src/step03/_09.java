package step03;

import java.util.Scanner;

/*
* 날짜 : 2022/08/23
* 이름 : 박가영
* 내용 : 3단계 9번 별을 찍는 문제2
*/
public class _09 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		for(int k = 1; k<=N; k++) {
		for(int i = N-1; i >= k; i--) {
			System.out.print(" ");
		    }
		for(int j = 1; j <= k; j++) {
			System.out.print("*");
		    }
			
				System.out.print("\n");
		}
			
		
	}

}
