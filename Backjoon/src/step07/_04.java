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
		
		
		try {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			double v1 = v-b;
			double v2 = a-b;
			
			double n = Math.ceil(v1/v2);
			long top = (long) n;
			
			
			if(v == a) {
				System.out.println(1);
			}else{
				System.out.println(top);
			}
			
			br.close();
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
