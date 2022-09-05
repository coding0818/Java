package step07;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/05
 * 이름 : 박가영
 * 내용 : 7단계 1번 손익분기점을 구하는 프로그램 만들기
 */
public class _01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		
		breakpoint(a,b,c);
		
	}
	
	public static void breakpoint(long a, long b, long c) {
		int i = 1;
		long n1 = a+b*i;
		long n2 = c*i;
		
		if(b>c) {
			System.out.println("-1");
		}
		else{
			for(i=1; i>0;i++) {
			if(n1<n2) 
				System.out.println(i);
				break;
			
		    }
		
	    }

    }
}