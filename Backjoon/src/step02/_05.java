package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/21
 * 이름 : 박가영
 * 내용 : 2단계 4번 문제
 */
public class _05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if (H <= 23 && H >= 0 && M <= 59 && M >= 0);
		
		if(H > 0 && M < 45 ) { 
			System.out.println((H - 1)+" "+(60-(45 - M)));
		}
		else if(H > 0 && M > 45 ) {
			System.out.println(H+" "+(M - 45));
		}
		else if(H > 0 && M == 45) {
			System.out.println(H);
		}
		else if(H == 0 && M < 45) {
			System.out.println("23 "+(60-(45 - M)));
		}
		else if(H == 0 && M > 45) {
			System.out.println(" "+(M - 45));
		}
		else if(H == 0 && M == 45) {
			System.out.println("");
		}
		
	}

}
