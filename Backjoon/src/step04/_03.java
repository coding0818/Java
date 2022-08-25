package step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
		Integer m[] = new Integer [10];
		for(int i=0; i<n.length; i++) {
			n[i] = Integer.parseInt(b.readLine());
			m[i] = n[i] % 42;
			}
		
			
			Set<Integer> set = new HashSet<Integer>(Arrays.asList(m));
			int x = set.size();
			
			w.write(x+"\n");
	     
		
		b.close();
		w.flush();
		w.close();

	 }	
}
