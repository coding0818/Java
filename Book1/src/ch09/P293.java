package ch09;
/*
 * 날짜 : 2022/09/11
 * 이름 : 박가영
 * 내용 : P293 추상 클래스와 템플릿 메서드
 */
public class P293 extends P291{

	@Override
	public void drive() {
        System.out.println("사람이 운전합니다");
        System.out.println("사람이 핸들을 조작합니다");
	}

	@Override
	public void stop() {
        System.out.println("브레이크로 정지합니다");		
	}

}
