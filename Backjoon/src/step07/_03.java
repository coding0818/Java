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
		
		int v1 = self(1);
		
		
	}
	
	public static int self(int n) {
	
		int a=n;
		int b=a+1;
		int c=b+1;
		
		int[] arr = {a, b, c};
		
		return arr[n];
		
		
		
		
	}

}
