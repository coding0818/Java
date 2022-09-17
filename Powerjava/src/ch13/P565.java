package ch13;

import java.util.Vector;

/*
 * 날짜 : 2022/09/17
 * 이름 : 박가영
 * 내용 : P565 객체를 벡터에 저장하기
 */
class Monster{
	String name;
	double hp;
	public Monster(String name, double hp) {
		this.name = name;
		this.hp = hp;
	}
	public String toString() {return"{"+name+","+hp+"}";}
}
public class P565 {
	public static void main(String[] args) {
		Vector<Monster> list = new Vector<>();
		
		list.add(new Monster("Mon1", 100));
		list.add(new Monster("Mon2", 200));
		list.add(new Monster("Mon3", 300));
		
		System.out.println("벡터의 크기: "+list.size());
		System.out.print(list);
	}

}
