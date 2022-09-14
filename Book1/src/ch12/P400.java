package ch12;
/*
 * 날짜 : 2022/09/14
 * 이름 : 박가영
 * 내용 : P400 자료형 매개변수를 두개 사용하는 클래스
 */
public class P400 <T,V>{
	T x;
	V y;
	
	P400(T x, V y){
		this.x = x;
		this.y = y;
	}
	
	public T getX() {
		return x;
	}
	
	public V getY() {
		return y;
	}
}
