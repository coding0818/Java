package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/22
 * 이름 : 박가영
 * 내용 : 3단계 4번 영수증 문제
 */
public class _04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int N = sc.nextInt();
		if(X >= 1 && X <= 1000000000 && N >= 1 && N <= 100);
		
				
		for(int i=1; i <= N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a >= 1 && a <= 1000000 && b >= 1 && b <= 10);
			
			X = X - (a*b);
			}
           
		
			
		if(X == 0) {
			System.out.println("Yes");
		}
		else {
		    System.out.println("No");
		}
			
		
	}
		
}


