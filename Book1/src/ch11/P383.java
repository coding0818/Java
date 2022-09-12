package ch11;
/*
 * 날짜 : 2022/09/12
 * 이름 : 박가영
 * 내용 : P383 Person 클래스의 인스터스 생성하기
 */
public class P383 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		P379 person1 = new P379();
		System.out.println(person1);
		
		Class pClass = Class.forName("ch11.P379");
		P379 person2 = (P379)pClass.newInstance();
		System.out.println(person2);
	}

}
