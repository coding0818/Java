package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 날짜 : 2022/09/17
 * 이름 : 박가영
 * 내용 : P504 여러 catch문 사용하기
 */
public class P504 {

	public Class loadClass(String fileName, String className) 
			throws FileNotFoundException, ClassNotFoundException{
				FileInputStream fis = new FileInputStream(fileName);
				Class c = Class.forName(className);
				return c;
			}
			
			public static void main(String[] args){
				P504 test = new P504();
				try {
					test.loadClass("a.txt", "java.lang.String");
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
}
