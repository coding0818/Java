package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 박가영
 * 내용 : 1단계 4번 두 수를 입력받고 뺄셈을 한 결과를 출력하는 문제 
 */
public class _04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A-B);
	}

}
