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
		
		a[0] = 1;
		
		for(int i=1;i>=1;i++) {
			for(int num = 1;num<a.length;num++) {
				for(int n=2; n<a.length; n++){
					num += n;
					a[num] = i;	
					if((x-1) == num) {
						System.out.println(a[num]);	
						break;
					}
				}	
			}
		}
		
		
		
		for(int j=0;j<b.length;j++) {
			
		}
		
		
		
	}
	
	

}
