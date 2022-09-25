package ch13;
/*
 * 날짜 : 2022/09/25
 * 이름 : 박가영
 * 내용 : P470
 */
interface PrintString{
	void showString(String str);
}
public class P470 {
	public static void main(String[] args) {
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("hello lamda_1");
		showMyString(lambdaStr);
	}
	public static void showMyString(PrintString p) {
		p.showString("hello lamda_2");
	}
}
