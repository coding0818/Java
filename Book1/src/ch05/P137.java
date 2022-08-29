package ch05;
/*
 * 날짜 : 2022/08/29
 * 이름 : 박가영
 * 내용 : P137 함수 구현하고 호출하기
 */
public class P137 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		System.out.println(num1+"+"+num2+"="+sum+"입니다.");
	}



public static int add(int n1, int n2) {
	int result = n1+n2;
	return result;
    }
}
