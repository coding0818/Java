package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/21
 * 이름 : 박가영
 * 내용 : 2단계 3번 윤년을 판별하는 문제
 */
public class _03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Y = sc.nextInt();
		
		if(Y >= 1 && Y <= 4000) {
			if(Y % 4 == 0 && Y % 100 != 0) {
				System.out.println("1");
			}
			else if(Y % 400 == 0) {
				System.out.println("1");
			}
			else {
				System.out.println("0");
			}
		}
	}

}
