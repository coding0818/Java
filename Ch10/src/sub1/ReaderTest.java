package sub1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 날짜 : 2022/09/14
 * 이름 : 박가영
 * 내용 : 문자스트림 실습하기
 */
public class ReaderTest {
	public static void main(String[] args) {
	
		String path = "C:\\Users\\java2\\Desktop\\Sample1.txt";
		
		try {
			FileReader fr = new FileReader(path);
			
			while(true) {
				
				int data = fr.read();
				
				if(data == -1) {
					break;
				}
				
				char c= (char) data;
				System.out.print(c);
			}
			
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
