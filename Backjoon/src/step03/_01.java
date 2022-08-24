package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/22
 * 이름 : 박가영
 * 내용 : 3단계 1번 구구단을 출력하는 문제
 */
public class _01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N >= 1 && N <= 9);
		
		
			for(int y = 1; y <= 9; y++) {
				int z = N * y;
				System.out.println(N +" * "+ y +" = "+ z);
			}
		}
	}


