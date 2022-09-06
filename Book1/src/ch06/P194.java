package ch06;
/*
 * 날짜 : 2022/09/06
 * 이름 : 박가영
 * 내용 : P194.195 private 생성자 만들기, 인스턴스 생성하기, public메서드 만들기, 변수의 주소 값 비교하기
 */
public class P194 {
	private static P194 instance = new P194(); //2단계 : 클래스 내부에 static으로 유일한 인스터스 생성하기
	private P194() {} //1단계 : 생성자를 private으로 만들기
	public static P194 getInstance() { //3단계 : 외부에서 참조할 수 있는 public 메서드 만들기
		if(instance == null) {
			instance = new P194();
		}
		return instance;
	}
	
	public static void main(String[] args) { //4단계 : 실제로 사용하는 코드 만들기
		P194 myCompany1 = P194.getInstance();
		P194 myCompany2 = P194.getInstance();
		System.out.println(myCompany1==myCompany2);
	}

}
