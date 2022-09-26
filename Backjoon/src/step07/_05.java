package step07;

import java.io.IOException;
import java.util.Scanner;

/*
 * 날짜 : 2022/09/23
 * 이름 : 박가영
 * 내용 : 7단계 5번 호텔 방 번호의 규칙을 찾아 출력하는 문제
 */
public class _05 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=1; i<=t; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			int a = n % h;
			double b1 = (double)n/h;
			double b = Math.ceil(b1);
			int room;
			
			if(a != 0) {
				room = (int) (a*100+b);	
			}else {
				room = (int) (100+b);
			}
			System.out.println(room);			
		}
		
	}

}
