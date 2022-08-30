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
		int n;
		
		
		for(int i=0; i<c; i++) {
			n = sc.nextInt();
			int score[] = new int [n];
			for(int k=0; k<n;k++) {
				score[k] = sc.nextInt();
				
				int total = 0;
				double avg = 0.0;
				double p = 0.0;
				for(int sum : score) {
					total += sum;
			    }
			    avg = total / score.length;
				
			
				while(avg > score[k]){
					p++;
				    p = p/score.length*100;
				    System.out.println(p);
				    break;
			    }
			}
				
		}
			
	}
			
}
