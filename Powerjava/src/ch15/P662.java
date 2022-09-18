package ch15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/09/18
 * 이름 : 박가영
 * 내용 : P662 UTF-8로 엔코딩한 파일 읽기
 */
public class P662 {
	public static void main(String[] args) throws IOException {
		File fileDir = new File("input.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileDir), "UTF-8"));
		
		String str;
		
		while((str = in.readLine()) != null) {
			System.out.println(str);
		}
		in.close();
	}

}
