package ch15;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 날짜 : 2022/09/17
 * 이름 : 박가영
 * 내용 : P526 byte 배열로 읽기
 */
public class P526 {
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input.txt")){
			byte[] bs = new byte[10];
			int i;
			while((i = fis.read(bs)) != -1) {
				for(byte b : bs) {
					System.out.print((char)b);
				}
				System.out.println(": "+i+"바이트 읽음");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
		
		
		
	}

}
