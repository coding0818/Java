package ch07;
/*
 * 날짜 : 2022/09/03
 * 이름 : 박가영
 * 내용 : P294 디폴트 메소드 예제
 */
interface Drawable{
	void draw();
	public default void getSize() {
		System.out.println("1024X768 해상도");
	}
}
class Circle3 implements Drawable{
    int radius;
	@Override
	public void draw() {
        System.out.println("Circle Draw");		
	}
	public void getSize() {
		System.out.println("3000X2000 해상도");
	}
}
public class P294 {
	public static void main(String[] args) {
		Drawable d = new Circle3();
		d.getSize();
		d.draw();
	}

}
