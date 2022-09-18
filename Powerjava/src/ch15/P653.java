package ch15;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 날짜 : 2022/09/18
 * 이름 : 박가영
 * 내용 : P653 이진 파일 읽기
 */
public class P653 {
	public static void main(String[] args) {
		
		byte list[] = new byte[6];
		try(FileInputStream out = new FileInputStream("test.bin")) {
			out.read(list);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		for(byte b : list) {
			System.out.print(b+" ");
		}
		System.out.println();
	}

}
