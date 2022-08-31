package sub7;
/*
 * 날짜 : 2022/08/31
 * 이름 : 박가영
 * 내용 : 다형성 실습하기
 */
public class Eagle extends Animal{
	
	@Override
	public void move() {
		System.out.println("Eagle fly...");
	}

	public void hunt() {
		System.out.println("Eagle hunt...");
	}

}
