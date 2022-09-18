package ch15;

import java.io.FileReader;
import java.io.IOException;

/*
 * 날짜 : 2022/09/18
 * 이름 : 박가영
 * 내용 : P536 FileReader로 읽기
 */
public class P536 {
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("reader.txt")){
			int i;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
