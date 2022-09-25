package ch13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
 * 날짜 : 2022/09/25
 * 이름 : 박가영
 * 내용 : P477 ArrayList에서 스트림 활용하기
 */
public class P477 {
	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s->System.out.print(s+" "));
		System.out.println();
		
		sList.stream().sorted().forEach(s->System.out.println(s));
	}
}
