package ch13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * 날짜 : 2022/09/17
 * 이름 : 박가영
 * 내용 : P583 문자열 정렬하기
 */
public class P583 {
	public static void main(String[] args) {
		String[] sample = {"i", "walk", "the", "line"};
		List<String> list = Arrays.asList(sample);
		Collections.sort(list);
		System.out.println(list);
	}

}
