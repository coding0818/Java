package ch06;
/*
 * 날짜 : 2022/09/03
 * 이름 : 박가영
 * 내용 : P258 동물 다형성
 */
class Animal1{
	void speak() {System.out.println("Animal 클래스의  sound()");}
}
class Dog1 extends Animal1{
	void speak() {System.out.println("멍멍");}
}
class Cat extends Animal1{
	void speak() {System.out.println("야옹");}
}
public class P258 {
public static void main(String[] args) {
	Animal1 a1 = new Dog1();
	Animal1 a2 = new Cat();
	
	a1.speak();
	a2.speak();
}
}
