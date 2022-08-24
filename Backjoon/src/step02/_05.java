package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/21
 * 이름 : 박가영
 * 내용 : 2단계 5번 시간 계산 문제
 */
public class _05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if (H <= 23 && H >= 0 && M <= 59 && M >= 0) {
			if(H > 0) {
			if(M < 45) { 
				H = H - 1;
				M = M + 15;}
			else {
				M = M - 45;}
			}
			
			else if(H == 0) {
			if(M < 45) {
				H = 23;
				M = M + 15;}
			else if(M >= 45) {
				M = M - 45;}
			}
			
			System.out.printf("%d %d", H, M);}
	   }
	}


