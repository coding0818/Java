package ch12;
/*
 * 날짜 : 2022/09/14
 * 이름 : 박가영
 * 내용 : P399 <t extends 클래스> 테스트하기
 */
public class P399 {
	public static void main(String[] args) {
		P398<Powder1> powderPrinter = new P398<Powder1>();
		powderPrinter.setMaterial(new Powder1());
		powderPrinter.printing();
		
		P398<Plastic1> plasticPrinter = new P398<Plastic1>();
		plasticPrinter.setMaterial(new Plastic1());
		plasticPrinter.printing();
	}
}
