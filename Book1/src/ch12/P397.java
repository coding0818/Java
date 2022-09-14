package ch12;
/*
 * 날짜 : 2022/09/14
 * 이름 : 박가영
 * 내용 : P397 GenericPrinter<T extends Material> 클래스
 */
public class P397<T extends P396> {
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
