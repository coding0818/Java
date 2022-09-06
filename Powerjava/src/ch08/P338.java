package ch08;
/*
 * 날짜 : 2022/09/06
 * 이름 : 박가영
 * 내용 : P338 equals() 메소드
 */
class Circle3{
	int radius;
	public Circle3(int radius) {this.radius = radius;}
	public boolean equals(Circle3 c1) {
		if(radius == c1.radius) {
			return true;
		}else return false;
	}
}
public class P338 {
	public static void main(String[] args) {
		Circle3 obj1 = new Circle3(10);
		Circle3 obj2 = new Circle3(10);
		if(obj1.equals(obj2))System.out.println("2개의 원은 같습니다.");
		else System.out.println("두개의 원은 같지 않습니다.");
	}

}
