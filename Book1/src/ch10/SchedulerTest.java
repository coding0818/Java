package ch10;

import java.io.IOException;

/*
 * 날짜 : 2022/09/11
 * 이름 : 박가영
 * 내용 : P324 입력 문자에 따라 배분 정책 수행하기
 */
public class SchedulerTest {
	public static void main(String[] args) throws IOException {
		System.out.println("전화 상담 하당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 할당");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch == 'r') {
			scheduler = new P322();
		}
		else if(ch == 'L' || ch == 'l') {
			scheduler = new P323();
		}
		else if(ch == 'P' || ch == 'p') {
			scheduler = new P324();
		}
		else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
