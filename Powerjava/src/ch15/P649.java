package ch15;

import java.io.FileReader;
import java.io.IOException;

/*
 * 날짜 : 2022/09/18
 * 이름 : 박가영
 * 내용 : P649 텍스트 파일 읽기
 */
public class P649 {
	public static void main(String[] args) {
		FileReader fr;
		try {
			fr = new FileReader("test.txt");
			int ch;
			while((ch = fr.read()) != -1) {
				System.out.print((char)ch+" ");
			}
			fr.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
