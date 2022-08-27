package ch04;
/*
 * 날짜 : 2022/08/27
 * 이름 : 박가영
 * 내용 : P151 Box 클래스 정의하고 객체 생성하기
 */

class Box{
	int width;
	int length;
	int height;
	double getVoume() {return(double)width*length*height;}
}

public class P151 {
	public static void main(String[] args) {
		Box b;
		b = new Box();
		b.width  = 20;
		b.length = 20;
		b.height = 30;
		System.out.println("상자의 가로, 세로, 높이는 "+b.width+", "+b.length+", "+b.height+"입니다.");
		System.out.println("상자의 부피는 "+b.getVoume()+"입니다.");
	}

}
