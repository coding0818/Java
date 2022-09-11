package ch10;
/*
 * 날짜 : 2022/09/11
 * 이름 : 박가영
 * 내용 : P328 인터페이스 구현하기
 */
public abstract class Calculator implements P328{
	public int add(int num1, int num2) {
		return num1+num2;
	}
	public int substract(int num1, int num2) {
		return num1-num2;
	}
}
