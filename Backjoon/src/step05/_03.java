package step05;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/02
 * 이름 : 박가영
 * 내용 : 5단계 3번 한수인지 판별하는 문제
 */
public class _03 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		int n = s.nextInt();
		
		han(n);
	}

	public static void han(int n) {
		int count=0;
		int ans = 0;
		
		if(n<100) {
			System.out.println(n);
		}
		
		else{
			for(int i=100; i<=n; i++) {
		
			
					int a1=(i / 100);
					int a2=(i % 100)/10;
					int a3=(i % 100)%10;
					if((a1-a2)==(a2-a3)) {
						count++;
					}
				
			}
			ans = count+99;
			System.out.println(ans);	
		}
		
		
	}
}
