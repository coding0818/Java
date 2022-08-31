package ch05;
/*
 * 날짜 : 2022/08/31
 * 이름 : 박가영
 * 내용 : P158 테스트 클래스 구현하기
 */
public class P158 {
	public static void main(String[] args) {
		Person personKim = new Person();
		personKim.name = "김유신";
		personKim.weight = 85.5F;
		personKim.height = 180.0F;
		
		Person personLee = new Person("이순신", 175,75);
	}

}
