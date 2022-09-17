package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 날짜 : 2022/09/17
 * 이름 : 박가영
 * 내용 : P501 throws로 예외 미루기
 */
public class P501 {
	public Class loadClass(String fileName, String className) 
	throws FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
		P501 test = new P501();
		test.loadClass("a.txt", "java.lang.String");
	}

}
