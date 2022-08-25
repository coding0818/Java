package step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
* 날짜 : 2022/08/25
* 이름 : 박가영
* 내용 : 4단계 4번 평균을 조작하는 문제
 */
public class _04 {
	public static void main(String[] args) throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(b.readLine()); if(n <= 1000);
		int d[] = new int[n];
		int max = d[0];
		int avg;
		for(int i=0; i<d.length; i++) {
			d[i] = Integer.parseInt(b.readLine());
			if(d[i]<=100 && d[i]>0);
			if(max < d[i]) {
				max = d[i];
				d[i] = d[i]/max*100;
				avg = d[i]/i;
				w.write(avg);
				break;
			}
		}
		
		
	
		
		
		
		b.close();
		w.flush();
		w.close();
	}

}
