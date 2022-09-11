package ch10;
/*
 * 날짜 : 2022/09/11
 * 이름 : 박가영
 * 내용 : P328 Calc 인터페이스에 디폴트 메서드 구현하기
 */
public interface P328 {
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);

	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
	}
}
