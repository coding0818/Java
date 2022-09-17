package ch13;

import java.util.ArrayList;

/*
 * 날짜 : 2022/09/17
 * 이름 : 박가영
 * 내용 : P568 객체를 ArrayList에 저장하기
 */
class Point{
	int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {return "("+x+","+y+")";}
}
public class P568 {
	public static void main(String[] args) {
		ArrayList<Point> list = new ArrayList<>();
		
		list.add(new Point(0,0));
		list.add(new Point(4,0));
		list.add(new Point(3,5));
		list.add(new Point(-1,3));
		list.add(new Point(13,2));
		
		System.out.println(list);
	}
}
