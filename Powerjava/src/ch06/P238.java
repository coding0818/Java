package ch06;
/*
 * 날짜 : 2022/09/03
 * 이름 : 박가영
 * 내용 : P238 Person클래스와 Employee 클래스 만들어보기
 */
class Person1{
	String name;
	public Person1() {}
	public Person1(String theName) {this.name = theName;}
}

class Employee extends Person1{
	String id;
	public Employee() {super();}
	public Employee(String name) {super(name);}
	public Employee(String name, String id) {
		super(name);
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id+ " name="+name+"]";
	}
}
public class P238 {
	public static void main(String[] args) {
		Employee e = new Employee("kim", "20210001");
		System.out.println(e);
	}

}
