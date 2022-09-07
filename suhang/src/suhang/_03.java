package suhang;

/*
 * 날짜 : 2022/09/07
 * 이름 : 박가영
 * 내용 : 수행평가 문제3번
 */
public class _03 {
	public static void main(String[] args) {
		
		
		
		for(int k=1; k<=5; k++) {
			for(int i = 4; i >= k; i--) {
				System.out.print("☆");
			    }
			for(int j = 1; j <= k; j++) {
				System.out.print("★");
			    }
			System.out.println();
		}
	}

}
