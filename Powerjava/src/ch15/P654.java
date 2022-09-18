package ch15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/*
 * 날짜 : 2022/09/18
 * 이름 : 박가영
 * 내용 : P654 이미지 파일 복사하기
 */
public class P654 {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		System.out.print("원본 파일 이름을 입력하시오: ");
		
		String inputFileName = scan.next();
		System.out.print("복사 파일 이름을 입력하시오");
		String outputFileName = scan.next();
		
		try(InputStream inputStream = new FileInputStream(inputFileName);
			OutputStream outputStream = new FileOutputStream(outputFileName)){
			int c;
			while((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		}
		System.out.println(inputFileName + "을"+ outputFileName+"로 복사하였습니다.");
			
		
	}

}
