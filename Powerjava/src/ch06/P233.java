package ch06;
/*
 * 날짜 : 2022/09/03
 * 이름 : 박가영
 * 내용 : P233 Person 클래스와 Student 클래스 만들어보기
 */
class Person{
	private String regnumer; //자식클래스에서 접근불가
	private double weight; //자식클래스에서 접근불가
	protected int age; //자식 클래스에서 접근가능
	String name; //어디서나 접근 가능
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
class Student extends Person{
	int id;
}
public class P233 {

	public static void main(String[] args) {
		Student obj = new Student();
		//obj.regnumber = "123456-123456" 오류
		//obj.weight = 75.0 오류
		obj.age = 21;
		obj.name = "kim";
		obj.setWeight(75.0);
	}
}
