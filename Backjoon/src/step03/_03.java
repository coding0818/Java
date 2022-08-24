package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/22
 * 이름 : 박가영
 * 내용 : 3단계 3번 1부터 N까지의 합을 구하는 문제
 */
public class _03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if(n >= 1 && n <= 10000);
		int sum = 0;
		
		
		for(int i = 1; i <= n; i++) {
			
			sum += i;
		}
		System.out.println(sum);
	}

}
