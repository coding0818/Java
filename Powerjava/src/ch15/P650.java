package ch15;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 날짜 : 2022/09/18
 * 이름 : 박가영
 * 내용 : P650 텍스트 파일 복사하기
 */
public class P650 {
	public static void main(String[] args) throws IOException {
		try(FileReader in = new FileReader("test.txt");
			FileWriter out = new FileWriter("copy.txt")){
			int c;
			while((c = in.read()) != -1) {
				out.write(c);
			}
		}
	}

}
