package ch07;
/*
 * 날짜 : 2022/09/03
 * 이름 : 박가영
 * 내용 : P296 정적 메소드 예제
 */
interface Employable{
	String getName();
	static boolean isEmpty(String str) {
		if(str == null || str.trim().length() == 0) {return true;}
		else {return false;}
	}
}
class Employeers implements Employable{
	private String name;

	public Employeers(String name) {
		if(Employable.isEmpty(name)==true) {
			throw new RuntimeException("이름은 반드시 입력하여야 함!");
		}
		this.name = name;
	}
	@Override
	public String getName() {
		return this.name;
	}
	
}
public class P296 {
	public static void main(String[] args) {
		Employable employee1 = new Employeers("홍길동");
		
	}

}
