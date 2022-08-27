package ch05;
/*
 * 날짜 : 2022/08/27
 * 이름 : 박가영
 * 내용 : P201 정적 변수 사용하기
 */
public class Pizza1 {
	private String toppings;
	private int radius;
	static final double PI = 3.141592;
	static int count = 0;             //정적 필드
	public Pizza1(String toppings) {
		this.toppings = toppings;
		count++;
	}
 
}
