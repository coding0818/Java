package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/09/08
 * 이름 : 박가영
 * 내용 : 7단계 3번 분수의 순서에서 규칙을 찾는 문제
 */
public class _03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int n=0;
		int count = 0;
		int a[] = new int [x];
		int b[] = new int [x];
		
		
		for(int j=0; j<=a.length; j++) {
			count += j;
			
			if(j % 2 == 0 && count >= x) {
				n = count-x;
				a[n] = j-n;
				b[n] = n+1;
				System.out.println(a[n]+"/"+b[n]);
				break;
			}else if(j % 2 == 1 && count>=x) {
				n = count-x;
				a[n] = n+1;
				b[n] = j-n;
				System.out.println(a[n]+"/"+b[n]);
				break;
			}
			
		}
		
		br.close();
	}
}
