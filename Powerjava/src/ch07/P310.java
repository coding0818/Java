package ch07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
/*
 * 날짜 : 2022/09/03
 * 이름 : 박가영
 * 내용 : P310 액션 이벤트 처리(익명 클래스)
 */
public class P310 {
	public static void main(String[] args) {
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println("beep");
			}
		};
		Timer t = new Timer(1000, listener);
		t.start();
		for(int i=0; i<1000; i++) {
			try {Thread.sleep(1000);}
			catch(InterruptedException e) {}
		}
	}

}
