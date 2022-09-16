package step07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022/09/16
 * 이름 : 박가영
 * 내용 : 7단계 4번 달팽이의 움직임을 계산하는 문제
 */
public class _04 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		try {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			for(int n=1; n>=1; n++) {
				int v1 = (a-b)*(n+1);
				int v2 = v * n;
				
				if(v1>v2) {
					System.out.print(n);
					break;
				}
			}
			
			br.close();
			bw.close();
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
