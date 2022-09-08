package sub4;
/*
 * 날짜 : 2022/09/08
 * 이름 : 박가영
 * 내용 : Math 클래스 실습하기
 */
public class MathTest {
	public static void main(String[] args) {
		
		// 수학 메서드
		System.out.println("절대값 : "+Math.abs(-5)); //절대값
		System.out.println("제곱근 : "+Math.sqrt(9)); //제곱근
		System.out.println("올림값 : "+Math.ceil(1.2)); //올림값
		System.out.println("올림값 : "+Math.ceil(1.8)); //올림값
		System.out.println("내림값 : "+Math.floor(1.2)); //내림값
		System.out.println("내림값 : "+Math.floor(1.8)); //내림값
		System.out.println("반올림 : "+Math.round(1.2)); //반올림
		System.out.println("반올림 : "+Math.round(1.8)); //반올림
		
		// random
		double num1 = Math.random();
		System.out.println("num1 : "+num1); //0에서 1사이에 실수
		
		double num2 = num1 * 10;
		System.out.println("num2 : "+num2); //0에서 10사이에 실수
		
		double num3 = Math.ceil(num2);
		System.out.println("num3 : "+num3); //1에서 10사이에 정수
		
		// 1에서 45사이 정수
		int rand = (int)Math.ceil(Math.random()*45);
		System.out.println("rand : "+rand);
	}

}
