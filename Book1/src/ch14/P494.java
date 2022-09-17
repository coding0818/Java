package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 날짜 : 2022/09/17
 * 이름 : 박가영
 * 내용 : P494 try-catch문 사용하기
 */
public class P494 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("a.txt");
		}catch(FileNotFoundException e){
			System.out.println(e);
		}
		System.out.println("여기도 수행됩니다.");
	}

}
