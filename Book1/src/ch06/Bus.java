package ch06;
/*
 * 날짜 : 2022/09/06
 * 이름 : 박가영
 * 내용 : P177 버스 클래스 구현하기
 */
public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println("버스 "+busNumber+"번의 승객은 "+passengerCount+"명이고, 수입은"+money+"입니다.");
	}

}
