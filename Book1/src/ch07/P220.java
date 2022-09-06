package ch07;
/*
 * 날짜 : 2022/09/06
 * 이름 : 박가영
 * 내용 : P220 이차원 배열 초기화하기
 */
public class P220 {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
	}

}
