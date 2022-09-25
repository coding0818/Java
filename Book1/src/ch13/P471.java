package ch13;
/*
 * 날짜 : 2022/09/25
 * 이름 : 박가영
 * 내용 : P471 반환 값으로 쓰이는 람다식
 */
interface PrintString1{
	void showString(String str);
}
public class P471 {
	public static void main(String[] args) {
		PrintString1 lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("hello lamda_1");
		showMyString(lambdaStr);
		PrintString1 reStr = returnString();
		reStr.showString("hello ");
	}
	public static void showMyString(PrintString1 p) {
		p.showString("hello lamda_2");
	}
	public static PrintString1 returnString() {
		return s -> System.out.println(s+"world");
	}
}
