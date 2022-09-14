package ch12;
/*
 * 날짜 : 2022/09/14
 * 이름 : 박가영
 * 내용 : P398 <T extends 클래스> 사용하기
 */
public class P398 <T extends P396>{
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	public T getMaterial() {
		return material;
	}
	public String toString() {
		return material.toString();
	}
	public void printing() {
		material.doPrinting();
	}
}
