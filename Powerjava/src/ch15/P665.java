package ch15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/*
 * 날짜 : 2022/09/18
 * 이름 : 박가영
 * 내용 : P665 Date 객체 저장하기
 */
public class P665 {
	public static void main(String[] args) throws Exception{
		ObjectInputStream in = null;
		ObjectOutputStream out = null;
		
		int c;
		
		out = new ObjectOutputStream(new FileOutputStream("object.dat"));
		out.writeObject(new Date());
		out.close();
		
		in = new ObjectInputStream(new FileInputStream("object.dat"));
		Date d = (Date) in.readObject();
		System.out.println(d);
		in.close();
	}

}
