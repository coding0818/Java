package ch15;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 날짜 : 2022/09/17
 * 이름 : 박가영
 * 내용 : P522 FileInputStream 사용하기
 */
public class P522 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
			}catch(IOException e) {
				System.out.println(e);
			}catch(NullPointerException e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
		
	}

}
