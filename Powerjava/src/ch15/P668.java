package ch15;

import java.io.File;
import java.io.IOException;

/*
 * 날짜 : 2022/09/18
 * 이름 : 박가영
 * 내용 : P668
 */
public class P668 {
	public static void main(String[] args) throws IOException{
		String name = "c:/eclipse";
		File dir = new File(name);
		String[] fileNames = dir.list();
		for(String s : fileNames) {
			File f = new File(name+"/"+s);
			System.out.println("==============================");
			System.out.println("이름 : "+f.getName());
			System.out.println("경로 : "+f.getPath());
			System.out.println("부모 : "+f.getParent());
			System.out.println("정대경로 : "+f.getAbsolutePath());
			System.out.println("정규경로 : "+f.getCanonicalPath());
			System.out.println("디렉터리 여부 : "+f.isDirectory());
			System.out.println("파일 여부 : "+f.isFile());
			System.out.println("==============================");
		}
	}

}
