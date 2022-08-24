package step03;

import java.util.Scanner;

/*
* 날짜 : 2022/08/23
* 이름 : 박가영
* 내용 : 3단계 10번 for과 if를 같이 쓰는 문제
 */
public class _10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int X = s.nextInt();
		if(N >= 1 && X <= 10000);
		
		for(int i = 1; i<=N; i++) {
			int A = s.nextInt();
			if(A >= 1 && A <= 10000);
			
			int d[] =  {A} ;
			for(int m = 0; m<d.length;m++) {
				if(d[m] < X) {
				
				System.out.print(d[m]+" ");}

			}
			
		}
		
	}

}
