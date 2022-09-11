package ch10;
/*
 * 날짜 : 2022/09/11
 * 이름 : 박가영
 * 내용 : P341 Queue 인터페이스 정의하기
 */
public interface Queue {

	void enQueue(String title);// 배열의 맨 마지막에 추가
	String deQueue();          // 배열의 맨 처음 항목 반환
	int getSize();             // 현재 Queue에 있는 개수 반환
}
