package ch02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/26
 * 이름 : 박가영
 * 내용 : P65 사용자로부터 입력받은 두 수를 받아서 더하기
 */
public class P065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y, sum;
		
		System.out.print("첫 번째 숫자를 입력하시오: "); // 줄을 바꾸지 않는다.
		x = sc.nextInt();
		
		System.out.print("두 번째 숫자를 입력하시오: ");
		y = sc.nextInt();
		
		sum = x + y;
		System.out.println(sum); // 합을 출력한다.
	}

}
