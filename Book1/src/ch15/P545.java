package ch15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2022/09/18
 * 이름 : 박가영
 * 내용 : P545 버퍼링 기능으로 파일 복사하기
 */
public class P545 {
	public static void main(String[] args) {
		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("a.zip");
			FileOutputStream fos = new FileOutputStream("copy.zip");
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			millisecond = System.currentTimeMillis();
			int i;
			while((i = bis.read()) != -1) {
				bos.write(i);
			}
			millisecond = System.currentTimeMillis() - millisecond;
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복하사는데"+millisecond+"milliseconds 소요되었습니다.");
	}
}
