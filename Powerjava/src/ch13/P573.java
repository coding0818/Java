package ch13;

import java.util.HashSet;

/*
 * 날짜 : 2022/09/17
 * 이름 : 박가영
 * 내용 : P573 문자열을 Set에 저장하기
 */
public class P573 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("Milk");
		set.add("Bread");
		set.add("Butter");
		set.add("Cheese");
		set.add("Ham");
		set.add("Ham");
		
		System.out.println(set);
		
		if(set.contains("Ham")) {
			System.out.println("Ham도 포함되어 있음");
		}
	}

}
