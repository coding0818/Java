package ch03;

import java.util.Arrays;

/*
 * 날짜 : 2022/08/27
 * 이름 : 박가영
 * 내용 : P120 래그드 배열
 */
public class P120 {
	public static void main(String[] args) {
		int[][] rarray = new int [3][];
		
		rarray[0] = new int[] {1,2,3};
		rarray[1] = new int[] {4,5,6,7};
		rarray[2] = new int[] {8,9};
		
		for(int[] row : rarray) {
			System.out.println(Arrays.toString(row));
		}
	}

}
