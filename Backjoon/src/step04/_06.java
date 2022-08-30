package step04;

import java.util.Scanner;

/*
* 날짜 : 2022/08/28
* 이름 : 박가영
* 내용 : 4단계 6번 평균을 넘는 학생 비율 구하기
 */
public class _06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		
		for(int i=0; i<c; i++) {
			int n = sc.nextInt();
			int score[] = new int [n];
			double total = 0.0;
			double p = 0.0;
			double avg = 0.0;
			for(int k=0; k<n;k++) {
				score[k] = sc.nextInt();
				total += score[k];
			}
			
			avg = total / score.length;
			
			for(int j=0; j<score.length;j++){
				if(avg < score[j]) {
				p++;
				}
		    }
			p = p/score.length*100;
		    System.out.println(String.format("%.3f", p)+"%");	
		}
			
	}
			
}
