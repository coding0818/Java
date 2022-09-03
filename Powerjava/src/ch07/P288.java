package ch07;
/*
 * 날짜 : 2022/09/03
 * 이름 : 박가영
 * 내용 : P288 원격 제어 인터페이스
 */
interface RemoteControl{
	void turnOn();
	void turnOff();
	public default void printBrand() {System.out.println("Remote Control 가능 TV");}
}
class Television implements RemoteControl{
	boolean on;

	@Override
	public void turnOn() {
		on = true;
		System.out.println("TV가 커졌습니다.");
	}

	@Override
	public void turnOff() {
		on = false;
		System.out.println("TV가 꺼졌습니다.");
	}
	
	public void printBrand() {System.out.println("Power Java TV입니다.");}
	
}
public class P288 {
	public static void main(String[] args) {
		RemoteControl obj = new Television();
		obj.turnOn();
		obj.turnOff();
		obj.printBrand();
	}

}
