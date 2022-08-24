package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

/*
 * 날짜 : 2022/08/22
 * 이름 : 박가영
 * 내용 : 3단계 5번 빠르게 입력받고 출력하는 문제
 */
public class _05 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		
		int T = Integer.parseInt(bf.readLine());
		if(T <= 1000000);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=1; i<=T; i++) {
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		if(a >= 1 && a<= 1000 && b >= 1 && b<= 1000 );
		
	    bw.write(a+b+"\n");
		
		}
		bf.close();
		bw.flush();
		bw.close();
	}

}
