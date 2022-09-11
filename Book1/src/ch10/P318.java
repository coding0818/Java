package ch10;
/*
 * 날짜 : 2022/09/11
 * 이름 : 박가영
 * 내용 : P318 CompleteCalc 클래스 실행하기
 */
public class P318 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		P317 calc = new P317();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
	}

}
