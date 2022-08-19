package ch02;
/*
 * 날짜 : 2022/08/17
 * 이름 : 박가영
 * 내용 : 자료형 추론
 */

public class P60 {
	public static void main(String[] args) {
		var i = 10; //int i = 10으로 컴파일됨
		var j = 10.0; //double j = 10.0으로 컴파일됨
		var str = "hello"; //String str = "hello"로 컴파일됨
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
	}

}
