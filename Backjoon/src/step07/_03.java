package step07;

import java.lang.reflect.Array;
import java.util.Scanner;

/*
 * 날짜 : 2022/09/08
 * 이름 : 박가영
 * 내용 : 7단계 3번 분수의 순서에서 규칙을 찾는 문제
 */
public class _03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a[] = new int[x];
		int b[] = new int[x];
		
		for(int i=0;i<a.length;i++){
			a[0] = 1;
			
			for(int k=0;k<=i;k++) {
				i += k+1;
			}
		}
		
		for(int j=0;j<b.length;j++) {
			
		}
		
		System.out.println(a[x]+"/"+b[x]);
		
		
		
	}
	
	

}
