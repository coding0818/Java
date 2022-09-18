package ch15;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2022/09/18
 * 이름 : 박가영
 * 내용 : P652 이진 파일 쓰기
 */
public class P652 {
	public static void main(String[] args) {
		
		byte list[] = {10,20,30,40,50,60};
		try (FileOutputStream out = new FileOutputStream("test.bin")){
			for(byte b : list) {
				out.write(b);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
