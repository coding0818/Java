package step04;

import java.util.Scanner;

/*
* 날짜 : 2022/08/28
* 이름 : 박가영
* 내용 : 4단계 5번 점수를 구하는 프로그램 작성
 */
public class _05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		String arr[] = new String [n];
		
		for(int i=0; i<n; i++) {
			int score = 0;
			int sum = 0;
			arr[i] = sc.nextLine();
			String[] OX = arr[i].split("");
			for(int k=0; k<OX.length; k++) {
				if(OX[k].equals("O")) {
					score++;
					sum += score;
				}
				else score = 0;
				
				
			} System.out.println(sum);
		}
		
	}

}
