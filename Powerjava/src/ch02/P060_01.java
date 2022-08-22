package ch02;
/*
 * 날짜 : 2022/08/22
 * 이름 : 박가영
 * 내용 : P60 원의 면적 계산하기
 */
public class P060_01 {
	public static void main(String[] args) {
		final double PI = 3.141592;
		double radius, area;
		
		radius = 5.0;
		area = PI * radius * radius;
		System.out.println("반지름이 5인 원의 면적은 "+area);
	}

}
