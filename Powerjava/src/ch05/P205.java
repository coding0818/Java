package ch05;
/*
 * 날짜 : 2022/08/27
 * 이름 : 박가영
 * 내용 : P205 정적 메소드 사용하기
 */
public class P205 {
	public static int cube(int x) {
		int result = x*x*x;
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("10*10*10*은 "+cube(10));
	}

}
