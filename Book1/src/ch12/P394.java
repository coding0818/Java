package ch12;
/*
 * 날짜 : 2022/09/14
 * 이름 : 박가영
 * 내용 : P394 GenericPrinter<T> 클래스 사용하기
 */
public class P394 {
	public static void main(String[] args) {
		P393<Powder> powderPrinter = new P393<Powder>();
		
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		
		P393<Plastic> plasticPrinter = new P393<Plastic>();
		
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
	}

}
