package ch12;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
 * 날짜 : 2022/09/17
 * 이름 : 박가영
 * 내용 : P437 Comparator 인터페이스 사용하기
 */
class MyCompare implements Comparator<String>{
	public int compare(String s1, String s2) {
		return (s1.compareTo(s2)) * -1;
	}
}

public class P437 {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>(new MyCompare());
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
		
		System.out.println(set);
	}

}
