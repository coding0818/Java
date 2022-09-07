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
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		breakpoint(a,b,c);
		
	}
	
	
	public static void breakpoint(int a, int b, int c) {
		int n1 = a/(c-b);
		int i[] = new int[2100000001];
		
		for(int k=0;k<i.length;k++) {
			i[k]=k+1;
		}
		if(b>=c) {
			System.out.println("-1");
		}		
		else{for(int j=0; j<i.length;j++) {
		   if(n1<i[j]) {
			   System.out.println(i[j]);
			   break;
		   }
		}   
	   }
		

    }
}