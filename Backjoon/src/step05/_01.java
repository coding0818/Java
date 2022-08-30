package step05;
/*
 * 날짜 : 2022/08/30
 * 이름 : 박가영
 * 내용 : 5단계 1번 정수 n개의 합
 */
public class _01 {
	public static long sum(int[] a) {
		
	    long sum = 0;
		
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		
		return sum;
	}
}


