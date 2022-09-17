package ch15;

import java.io.Console;

/*
 * 날짜 : 2022/09/17
 * 이름 : 박가영
 * 내용 : P519 Console 테스트하기
 */
public class P519 {
	public static void main(String[] args) {
		Console cs = System.console();
		
		System.out.println("이름:");
		String name = cs.readLine();
		System.out.println("직업:");
		String job = cs.readLine();
		System.out.println("비밀번호:");
		char[] pass = cs.readPassword();
		String strPass = new String(pass);
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
	}

}
