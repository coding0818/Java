package step03;

import java.util.Scanner;

/*
* 날짜 : 2022/08/23
* 이름 : 박가영
* 내용 : 3단계 11번 문제
 */
public class _11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int A = s.nextInt();
		int B = s.nextInt();
		
		
		while(A != 0 && B != 0){
			System.out.print(A+B);
			A = s.nextInt();
			B = s.nextInt();
			
			
		  }
		
		
	    }

}

