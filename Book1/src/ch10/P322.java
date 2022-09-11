package ch10;
/*
 * 날짜 : 2022/09/11
 * 이름 : 박가영
 * 내용 : P322 순서대로 배분하기
 */
//상담원 한 명씩 돌아가며 동일하게 상담 업무 배분
public class P322 implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에서 배분합니다.");
		
	}
	
}
