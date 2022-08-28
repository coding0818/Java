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
		
		int n = sc.nextInt();
		String arr[] = new String [n];
		int score = 0;
		int sum = 0;
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextLine();
			String[] OX = arr[i].split("");
			for(int k=0; k<OX.length; k++) {
				if(OX[k]=="O") {
					score++;
					sum += score;
				}
				else {
					score = 0;
				}
			}
		}
		System.out.println(sum);
	}

}
