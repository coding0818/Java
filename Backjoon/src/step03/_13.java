package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
* 날짜 : 2022/08/24
* 이름 : 박가영
* 내용 : 3단계 13번 원래 수로 돌아올 때까지 연산을 반복하는 문제
 */
public class _13 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		if(N <= 99 && N > 0) {
		int C = N;
		
		for(int i = 1; i>=1; i++) {
			N = (((N % 10)) * 10)+((N % 10)+(N / 10))%10;
			int b = (((N % 10)) * 10)+((N % 10)+(N / 10))%10;
			
			
			if(C==b) {
				bw.write((i+1)+"\n");
				break;
			}
		
		  }
		}
		if(N == 0) {
			bw.write("1");
		}
		 br.close();
		 bw.flush();
		 bw.close();
	}

}
