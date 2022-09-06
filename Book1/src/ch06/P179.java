package ch06;
/*
 * 날짜 : 2022/09/06
 * 이름 : 박가영
 * 내용 : P179 학생, 버스, 지하철 객체 협력하기
 */
public class P179 {
	public static void main(String[] args) {
		Student7 studentJames = new Student7("James", 5000);
		Student7 studentTomas = new Student7("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
	}

}
