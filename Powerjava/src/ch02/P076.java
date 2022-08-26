package ch02;
/*
 * 날짜 : 2022/08/26
 * 이름 : 박가영
 * 내용 : P76 조건 연산자 사용하기
 */
public class P076 {
	public static void main(String[] args) {
		double area1 = 2*3.141592*20*20;
		double area2 = 3.141592*30*30;
		System.out.println("20cm 피자 면적="+area1);
		System.out.println("30cm 피자 면적="+area2);
		System.out.println((area1>area2)? "20cm 두개":"30cm 한개");
	}

}
