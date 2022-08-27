package ch03;

import java.util.ArrayList;

/*
 * 날짜 : 2022/08/27
 * 이름 : 박가영
 * 내용 : P122 ArrayList 사용
 */
public class P122 {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("철수");
		list.add("영희");
		list.add("순신");
		list.add("자영");
		for(String obj : list) {
			System.out.print(obj+" ");
		}
	}

}
