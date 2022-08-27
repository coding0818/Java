package ch04;
/*
 * 날짜 : 2022/08/27
 * 이름 : 박가영
 * 내용 : P157 생성자 만들어 보기
 */
public class P157 {
	private int channel;
	private int volume;
	private boolean onoff;
	
	P157(int c, int v, boolean o){
		channel = c;
		volume = v;
		onoff = o;
	}
	
	void print() {
		System.out.println("채널은 "+channel+"이고 볼륨은 "+volume+"입니다.");
	}

}

