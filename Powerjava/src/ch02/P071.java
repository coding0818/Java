package ch02;
/*
 * 날짜 : 2022/08/26
 * 이름 : 박가영
 * 내용 : P71 증감, 복합 대입 연산자 실습하기
 */
public class P071 {
	public static void main(String[] args) {
		int x=1, y=1;
		
		int a = x++;//x의 값이 사용되기 전에 증가된다. a는 1이 된다.
		int b = ++y;//y의 값이 사용된 후에 증가된다. b는 2가 된다.
		System.out.println("a= "+a+ ", b="+b);
		
		int c = 100, d = 200;
		c += 10; //c = c + 10
		d /= 10; //d = d /10
		System.out.println("c="+c+"c d="+d );
	}

}
