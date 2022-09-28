package step06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StreamTokenizer;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022/09/28
 * 이름 : 박가영
 * 내용 : 6단계 2번
 */
public class _02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int n1;

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int j=1; j<=n; j++) {
			n1 = Integer.parseInt(st.nextToken());
		}
		
		
		
	}
}
