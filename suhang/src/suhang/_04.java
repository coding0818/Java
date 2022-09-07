package suhang;


/*
 * 날짜 : 2022/09/07
 * 이름 : 박가영
 * 내용 : 수행평가 문제4번
 */
public class _04 {
	public static void main(String[] args) {
		
		
		for(int k=1; k<=4; k++) {
			
			for(int i = 3; i >= k; i--) {
				System.out.print("☆");
			    }
			for(int j = 1; j <= 2*k-1; j++) {
				System.out.print("★");
			    }
			for(int i = 3; i >= k; i--) {
				System.out.print("☆");
			    }
			System.out.println();
		}
	}

}
