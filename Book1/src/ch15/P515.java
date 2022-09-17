package ch15;

import java.io.IOException;

/*
 * 날짜 : 2022/09/17
 * 이름 : 박가영
 * 내용 : P515 문자 하나를 입력받기
 */
public class P515 {
	public static void main(String[] args) throws IOException{
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
		
		int i;
		try {
			i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
