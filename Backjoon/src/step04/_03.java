package step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;

/*
* 날짜 : 2022/08/25
* 이름 : 박가영
* 내용 : 4단계 3번 서로 다른 나머지값이 몇 개인지 찾는 문제
 */
public class _03 {
	 public static void main(String[] args) throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n[] = new int[10];
		int y;
		for(int i=0; i<n.length; i++) {
			n[i] = Integer.parseInt(b.readLine());
			if(y == n[i] % 42) {
			int[] m = {y};
			HashSet<int> hashSet = new HashSet<>(Arrays.asList(m));
			int[] result = hashSet.toArray(new int[0]);
			
			w.write(result.length+"\n");
			}
	     }
		
		b.close();
		w.flush();
		w.close();

	 }	
}
