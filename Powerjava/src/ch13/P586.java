package ch13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 날짜 : 2022/09/17
 * 이름 : 박가영
 * 내용 : P586 숫자들의 리스트 탐색하기
 */
public class P586 {
	public static void main(String[] args) {
		int key = 50;
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<100; i++) {
			list.add(i);
		}
		int index = Collections.binarySearch(list, key);
		System.out.println("탐색의 반환값 = "+index);
	}

}
