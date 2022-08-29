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
		int[] n = new int [c];
		int score[] = new int [n[0]];
		int total = 0;
		double avg = 0.0;
		double p = 0.0;
		
		for(int i=0; i<c; i++) {
			n[i] = sc.nextInt();
			for(int k=0; k<n.length;k++) {
				score[k] = sc.nextInt();
			}
		}
			
		
		for(int sum : score) {
				total += sum;
		}
		avg = total / score.length;
			
		for(int j=0; j<score.length;j++) {
			if(avg > score[j]){
				p++;
			    p = p/score.length*100;
		    }
		}
		
		System.out.println(p);
			
	}
			
}
