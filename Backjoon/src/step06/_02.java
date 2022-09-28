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
 * 내용 : 6단계 2번 정수를 문자열로 입력받는 문제
 */
public class _02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String n1 = br.readLine();
		
		String[] s = n1.split("");
		String total;
		int sum = 0;
		
		for(int i=0; i<s.length; i++) {
			int num = Integer.parseInt(s[i]);
			sum += num;
		}
		total = Integer.toString(sum);
		
		bw.write(total);
		
		br.close();
		bw.flush();
		bw.close();
	}
}
