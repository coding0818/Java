package ch09;
/*
 * 날짜 : 2022/09/11
 * 이름 : 박가영
 * 내용 : P292 추상 클래스와 템플릿 메서드
 */
public class P292 extends P291{

	@Override
	public void drive() {
        System.out.println("자율 주행합니다");
        System.out.println("자동차가 알아서 방향을 전환합니다.");
	}

	@Override
	public void stop() {
        System.out.println("스스로 멈춥니다.");		
	}

}
