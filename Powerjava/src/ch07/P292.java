package ch07;
/*
 * 날짜 : 2022/09/03
 * 이름 : 박가영
 * 내용 : P292 다중 상속 예제
 */
class Shape2{
	protected int x, y;
}
interface Drawble{
	void draw();
}
class Circle2 extends Shape2 implements Drawble{
	int radius;

	@Override
	public void draw() {
	System.out.println("Circle Draw at ("+x+", "+y+")");
	}
	
}
public class P292 {
	public static void main(String[] args) {
		Drawble obj = new Circle2();
		obj.draw();
	}

}
