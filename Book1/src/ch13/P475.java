package ch13;

import java.util.Arrays;

/*
 * 날짜 : 2022/09/25
 * 이름 : 박가영
 * 내용 : P475 정수 배열에서 스트림 활용하기
 */
public class P475 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		int sumVal = Arrays.stream(arr).sum();
		int count = (int)Arrays.stream(arr).count();
		
		System.out.println(sumVal);
		System.out.println(count);
	}
}
