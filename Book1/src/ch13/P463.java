package ch13;
/*
 * 날짜 : 2022/09/25
 * 이름 : 박가영
 * 내용 : P463 람다식 구현과 호출
 */
public class P463 {
	public static void main(String[] args) {
		MyNumber max = (x,y) -> (x >= y) ? x : y;
		System.out.println(max.getMax(10, 20));
	}
}
