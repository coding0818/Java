package step07;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/07
 * 이름 : 박가영
 * 내용 : 7단계 1번 손익분기점을 구하는 프로그램 만들기
 */
public class _01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		if(b>=c) {
			System.out.println("-1");
		}		
		else if(c-b==1){
			System.out.println(a+1);}
		else {
			 int n1 = a/(c-b);
			 for(int j=1; j<2100000001;j++) {
		
		        if(n1<j) {
			       System.out.println(j);
			       break;
		        }
		     }   
	    }
	
	
	}
    
}