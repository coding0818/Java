package step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
* 날짜 : 2022/08/24
* 이름 : 박가영
* 내용 : 4단계 2번 최댓값이 어디에 있는지 찾는 문제
 */
public class _02 {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int [] a = new int[9];
		int max = a[0];
		int num = 0;
		
		
		for(int i=0; i<a.length; i++) {
			a[i] = Integer.parseInt(r.readLine());
			
			
			if(max < a[i]) {
				
				max = a[i];
				num = i+1;
				
				}
			}
		w.write(max+"\n");
		w.write(num+"\n");
		
		r.close();
		w.flush();
		w.close();

	}

}
