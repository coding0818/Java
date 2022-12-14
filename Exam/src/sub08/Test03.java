package sub08;
/*
 * 날짜 : 2022/09/29
 * 이름 : 박가영
 * 내용 : 자바 총정리 연습문제
 */
class Member{
	private String name;
	private String hp;
	private int age;
	
	public Member(String name, String hp, int age) {
		this.name = name;
		this.hp = hp;
		this.age = age;
	}
	
	public String toString() {
		return String.format("%s,%s,%d", name, hp, age);
	}
	
}
public class Test03 {
	public static void main(String[] args) {
		Member m1 = new Member("김유신", "010-1234-1001", 25);
		Member m2 = new Member("김춘추", "010-1234-1002", 23);
		
		System.out.println(m1);
		System.out.println(m2);
	}
}
