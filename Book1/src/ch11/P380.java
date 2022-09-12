package ch11;
/*
 * 날짜 : 2022/09/12
 * 이름 : 박가영
 * 내용 : P380 Person의 Class 클래스 가져오기
 */
public class P380 {
	public static void main(String[] args) throws ClassNotFoundException {
		P379 person = new P379();
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		Class pClass2 = P379.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("ch11.P379");
		System.out.println(pClass3.getName());
	}

}
