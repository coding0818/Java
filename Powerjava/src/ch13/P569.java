package ch13;

import java.util.ArrayList;

/*
 * 날짜 : 2022/09/17
 * 이름 : 박가영
 * 내용 : P569 문자열을 ArrayList에 저장하기
 */
public class P569 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		list.add("Pear");
		list.add("Grape");
		
		int index = list.indexOf("Mango");
		
		System.out.println("Mango의 위치 : "+index);
	}

}
