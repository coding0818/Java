package step04;

import java.util.Scanner;

/*
* 날짜 : 2022/08/24
* 이름 : 박가영
* 내용 : 4단계 1번 최솟값과 최댓값을 찾는 문제
 */
public class _01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int[]arr = new int[N];
		for(int i=0; i<arr.length; i++) {
			arr[i] = s.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		for(int j=0; j<arr.length; j++) {
			if(arr[j]>max) {
				max = arr[j];
			}
			if(arr[j]<min) {
				min = arr[j];
			}
		}
		
		System.out.print(min+" "+max);
	}
	

}
