package ch05;
/*
 * 날짜 : 2022/08/27
 * 이름 : 박가영
 * 내용 : P201 정적 변수 사용하기
 */
public class P201 {
	public static void main(String[] args) {
		Pizza1 p1 = new Pizza1("Super Supreme");
		Pizza1 p2 = new Pizza1("Cheese");
		Pizza1 p3 = new Pizza1("Pepperoni");
		int n = Pizza1.count;
		System.out.println("지금까지 판매된 피자 개수 = "+n);
		
	}

}
