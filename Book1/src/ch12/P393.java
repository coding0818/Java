package ch12;
/*
 * 날짜 : 2022/09/14
 * 이름 : 박가영
 * 내용 : P393 GenericPrinter<T> 클래스 정의하기
 */
public class P393<T> {
	private T material; //T자료형으로 선언한 변수
	
	public void setMaterial(T material) {
		this.material = material;
	}
	public T getMaterial() {
		return material;
	}
	public String toString() {
		return material.toString();
	}
}
