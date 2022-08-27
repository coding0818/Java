package ch05;
/*
 * 날짜 : 2022/08/27
 * 이름 : 박가영
 * 내용 : P206 정적 블록
 */
public class P206 {
	static int number;
	static String s;
	static {
		number = 23;
		s = "Hello World! ";
	}
	
	public static void main(String[] args) {
		System.out.println("number: "+number);
		System.out.println("s: "+s);
	}

}
