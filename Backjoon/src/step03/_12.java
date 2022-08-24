package step03;

import java.util.Scanner;

/*
* 날짜 : 2022/08/24
* 이름 : 박가영
* 내용 : 3단계 12번 입력이 끝날 때까지 A+B를 출력하는 문제(EOF)
 */
public class _12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
				
		while(s.hasNextInt()) {
			
			System.out.println(s.nextInt()+s.nextInt());
			
		}
	}

}
