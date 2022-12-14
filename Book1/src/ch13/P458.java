package ch13;
/*
 * 날짜 : 2022/09/25
 * 이름 : 박가영
 * 내용 : P458 익명 내부 클래스 예제
 */
class Outer2{
	Runnable getRunnable(int i) {
		int num = 100;
		
		return new Runnable() {
			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);
			}
		};
	}
	
	Runnable runner = new Runnable() {
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");
		}
	};
}
public class P458 {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runnerble = out.getRunnable(10);
		runnerble.run();
		out.runner.run();
	}
}
