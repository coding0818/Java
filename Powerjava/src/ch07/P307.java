package ch07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/*
 * 날짜 : 2022/09/03
 * 이름 : 박가영
 * 내용 : P307 액션 이벤트 처리
 */
public class P307 {
	public static void main(String[] args) {
		class Myclass1 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent event) {
				System.out.println("beep");
			}
		}
		ActionListener listener = new Myclass1();
		Timer t= new Timer(1000,listener);
		t.start();
		for(int i=0; i<1000; i++) {
			try {Thread.sleep(1000);}
			catch(InterruptedException e) {}
		}
	}

}
