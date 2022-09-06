package ch08;
/*
 * 날짜 : 2022/09/06
 * 이름 : 박가영
 * 내용 : P337 toString() 메소드
 */
class Circle1{
	int radius;
	public Circle1(int radius){this.radius = radius;}
	public String toString() {return "Circle(r="+radius+")";}
}
public class P337_1 {
	public static void main(String[] args) {
		Circle1 obj = new Circle1(10);
		System.out.println(obj);
	}

}
