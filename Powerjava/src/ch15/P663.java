package ch15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 날짜 : 2022/09/18
 * 이름 : 박가영
 * 내용 : P663 Animal 클래스와 Dog 클래스 만들어보기
 */
public class P663 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		
		try {
			inputStream = new BufferedReader(new FileReader("input.txt"));
			outputStream = new PrintWriter(new FileWriter("output.txt"));
			String l;
			while((l = inputStream.readLine()) != null) {
				outputStream.println(l);
			}
		}finally {
			if(inputStream != null) {inputStream.close();}
			if(outputStream != null) {outputStream.close();}
		}
	}

}
