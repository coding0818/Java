package ch08;
/*
 * 날짜 : 2022/09/09
 * 이름 : 박가영
 * 내용 : P259 다형성 테스트하기
 */
class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}
class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}

public class P259 {
	public static void main(String[] args) {
		P259 aTest = new P259();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
	}

	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
