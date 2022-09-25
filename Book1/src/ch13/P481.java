package ch13;
/*
 * 날짜 : 2022/09/25
 * 이름 : 박가영
 * 내용 : P481 스트림 활용하기(1)
 */
public class P481 {
	private String name;
	private int age;
	private int price;
	
	public P481(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getPrice() {
		return price;
	}
	public String toString() {
		return "name: " + name + "age: "+age+ "price: "+price;
	}
}
