package ch04;
/*
 * 날짜 : 2022/08/27
 * 이름 : 박가영
 * 내용 : P150 DeskLamp 클래스 작성하고 객체 생성해보기
 */
public class DeskLamp {
	//인스턴스 변수 정의
	private boolean isOn;
	
	//메소드 정의
	public void turnOn() {isOn = true;}
	public void turnOff() {isOn = false;}
	public String toString() {
		return "현재 상태는 "+ (isOn==true ? "켜짐" : "꺼짐");
	}

}
