package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

/*
 * 날짜 : 2022/09/08
 * 이름 : 박가영
 * 내용 : 7단계 3번 분수의 순서에서 규칙을 찾는 문제
 */
public class _03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		String a[] = new String [x];
		
		
		for(int n=0; n<a.length; n++) {
			a[0] = 1+"/"+1;
			a[1] = 1+"/"+2;
			a[2] = 2+"/"+1;
		}
		
	}
	
	

}
