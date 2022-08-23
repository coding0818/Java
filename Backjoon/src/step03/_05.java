package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

/*
 * 날짜 : 2022/08/22
 * 이름 : 박가영
 * 내용 : 3단계 5번 문제
 */
public class _05 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		
		int T = Integer.parseInt(bf.readLine());
		if(T <= 1000000);
		int a;
		int b;
		
		
		for(int i=1; i<=T; i++) {
		a = Integer.parseInt(bf.readLine());
		b = Integer.parseInt(bf.readLine());
		
		if(a >= 1 && a<= 1000 && b >= 1 && b<= 1000 );
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int d = a + b;
		bw.write(d);
		bw.flush();
		bw.close();
		}
	}

}
