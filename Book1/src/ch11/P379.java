package ch11;
/*
 * 날짜 : 2022/09/12
 * 이름 : 박가영
 * 내용 : P379 person 클래스 생성하기
 */
public class P379 {
	private String name;
	private int age;
	
	public P379() {}
	
	public P379(String name) {
		this.name = name;
	}
	public P379(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
