package step07;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/07
 * 이름 : 박가영
 * 내용 : 7단계 2번 벌집이 형성되는 규칙에 따라 벌집의 위치를 구하는 문제
 */
public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	
		if(n==1) {
			System.out.println("1");
		}else {
			for(int j=1; j>0; j++) {
				int max = 0;
				int min = 0;
				for(int i=1;i<=j;i++) {
					max += i;
			    }
			    for(int k=1; k<=j-1; k++) {
			         min += k;
	  		    }
			    int a = 6*max+1;
			    int b = 6*min+1;
			    if(n<=a && n>b) {
				     System.out.println(j+1);
				     break;
			    }
			    
			}
		}
		
		
		
	}
	
}


