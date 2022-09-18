package ch15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 날짜 : 2022/09/18
 * 이름 : 박가영
 * 내용 : P659 줄 단위로 복사하기
 */
public class P659 {
	public static void main(String[] args) {
		
		try(BufferedReader in = new BufferedReader(new FileReader("test.txt"));
			PrintWriter out = new PrintWriter(new FileWriter("output.txt"))){
			String line;
			while((line = in.readLine()) != null) {
				out.println(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}


