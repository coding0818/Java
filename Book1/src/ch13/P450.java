package ch13;
/*
 * 날짜 : 2022/09/25
 * 이름 : 박가영
 * 내용 : P450 인스터스 내부 클래스 예제
 */
class OutClass{
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass {
		int inNum = 100;
		// static int sInNum = 200;
		
		void inTest() {
			System.out.println("OutClass num = "+num+"(외부 클래스이 인스턴스 변수)");
			System.out.println("OutClass sNum = "+sNum+"(외부 클래스의 정적 변수)");
		}
	}
	public void usingClass() {
		inClass.inTest();
	}
}
public class P450 {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();
	}
}
