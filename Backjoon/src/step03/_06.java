package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022/08/23
 * 이름 : 박가영
 * 내용 : 3단계 6번 문제
 */
public class _06 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(bf.readLine());
		
		for(int i = 1; i <= T; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			if(A > 0 && B < 10);
		    			
			bw.write("Case #"+i+": "+(A+B)+"\n");
		}
		bf.close();
		bw.flush();
		bw.close();
	}

}
