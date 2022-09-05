package sub1;
/*
 * 날짜 : 2022/08/31
 * 이름 : 박가영
 * 내용 : 다형성 실습하기
 */
public class Tiger extends Animal{
	
	@Override
	public void move() {
		System.out.println("Tiger run...");
	}
	
	public void hunt() {
		System.out.println("Tiger hunt...");
	}

}
