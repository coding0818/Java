package ch15;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2022/09/17
 * 이름 : 박가영
 * 내용 : P531 파일에 바이트 배열로 출력하기
 */
public class P531 {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("output2.txt", true);
		try(fos){
			byte[] bs = new byte[26];
			byte data = 65;
			for(int i=0; i<bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs);
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
		
	}

}
