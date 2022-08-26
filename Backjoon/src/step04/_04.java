package step04;

import java.util.Scanner;

/*
* 날짜 : 2022/08/25
* 이름 : 박가영
* 내용 : 4단계 4번 평균을 조작하는 문제
 */
public class _04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double score[] = new double[n];
		double f[] = new double[n];
		
		for(int i=0; i<n; i++) {
			score[i] = sc.nextDouble();
		}
		
		double max=score[0];
		for(int k=0; k<n; k++) {
			if(max < score[k]) {
				max = score[k];
			}
		}
		
		double total = 0.0;
		
		for(int i=0; i<n; i++) {
		f[i] = score[i]*100/max;
		total += f[i];
		}
		
				
		double result = total/n;
		
		System.out.println(result);
		
		
	}

}
