package ch10;
/*
 * 날짜 : 2022/09/11
 * 이름 : 박가영
 * 내용 : P322 Scheduler 인터페이스 정의하기
 */
public interface Scheduler {
	public void getNextCall();
	public void sendCallToAgent();

}
