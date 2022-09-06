package ch06;
/*
 * 날짜 : 2022/09/06
 * 이름 : 박가영
 * 내용 : this를 사용하여 주소 값 반환하기
 */
class Person1{
	String name;
	int age;
	
	Person1(){
		this("이름 없음",1);
	}
	Person1(String name, int age){
		this.name = name;
		this.age = age;
	}
	Person1 returnItSelf() {
		return this; //this반환
	}
}
public class P173 {
	public static void main(String[] args) {
		Person1 noName = new Person1();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person1 p = noName.returnItSelf(); //this 값을 클래스 변수에 대입
		System.out.println(p); //noName.returnItSelf()의 반환 값 출력
		System.out.println(noName); //참조 변수 출력
	}

}
