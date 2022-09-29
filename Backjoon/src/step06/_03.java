package step06;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/28
 * 이름 : 박가영
 * 내용 : 6단계 3번 알파벳 찾기
 */
public class _03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String[] str = s.split("");
		String[] alpabet = {"a","b","c","d","e","f",
							"g","h","i","j","k","l",
							"m","n","o","p","q","r",
							"s","t","u","z","w","x","y","z"};
		
		for(int i=0; i<alpabet.length; i++) {
			boolean a = true;
			for(int j=0; j<str.length;j++) {
				a = alpabet[i].equals(str[j]);
				if(a==true) {
					System.out.print(" "+j+" ");
					break;
				}
			}
			if(a==false) {
				System.out.print(" -1 ");
			}
		}
		
	}
}
