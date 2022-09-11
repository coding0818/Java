package ch10;

import java.util.ArrayList;

/*
 * 날짜 : 2022/09/11
 * 이름 : 박가영
 * 내용 : P340 Shelf 클래스 만들기
 */
public class P340 {
	protected ArrayList<String> shelf;
	
	public P340() {
		shelf = new ArrayList<String>();
	}
	public ArrayList<String> getShelf() {
		return shelf;
	}
	public int getCount() {
		return shelf.size();
	}

}
