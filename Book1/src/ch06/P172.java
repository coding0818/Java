package ch06;
/*
 * 날짜 : 2022/09/06
 * 이름 : 박가영
 * 내용 : this로 다른 생성자 호출하기
 */
class Person{
	String name;
	int age;
	
	Person(){
		this("이름 없음",1);
	}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}
public class P172 {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
	}

}
