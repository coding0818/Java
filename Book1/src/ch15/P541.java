package ch15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/09/18
 * 이름 : 박가영
 * 내용 : P541 InputStreamReader 사용하기
 */
public class P541 {
	public static void main(String[] args) {
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){
			int i;
			while((i = isr.read()) != -1) {
				System.out.print((char)i);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
