package ch08;
/*
 * 날짜 : 2022/09/06
 * 이름 : 박가영
 * 내용 : P356 입력 예외 처리
 */
public class P356 {
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt("ABC");
			System.out.println(num);
		} catch(NumberFormatException e) {
			System.out.println("NumberFormat 예외 발생");
		}
	}

}
