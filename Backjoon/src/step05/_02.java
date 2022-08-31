package step05;
/*
 * 날짜 : 2022/08/30
 * 이름 : 박가영
 * 내용 : 5단계 2번 셀프넘버 출력하는 프로그램 만들기
 */
public class _02 {
	public static void main(String[] args) {
		System.out.print(selfNumber(1));
	}

	public static int selfNumber(int n) {
		int n1=0;
		for(n=1; n<=10000; n++) {
			n1 = n + (n/10) + (n%10);
		}
		
		int[]a= {n1};
		int y[]=;
		for(int i=0; i<a.length; i++) {
			if(a[i] != n1) {
				y = a[i];	
			}
		}
		return y[];
	}
}
