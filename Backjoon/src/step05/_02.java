package step05;
/*
 * 날짜 : 2022/08/30
 * 이름 : 박가영
 * 내용 : 5단계 2번 셀프넘버 출력하는 프로그램 만들기
 */
public class _02 {
	public static void main(String[] args) {
		selfNumber();
	}

	public static void selfNumber() {
		int n1;
		int[]a= new int [] {};
		for(int n=1; n<=10000; n++) {
			n1 = n + (n/10) + (n%10);
			a[n-1]=n1;
		}
		
		int[]y= new int[10000];
		for(int j=0;j<y.length;j++) {
		    y[j]=j+1;	
		}
		
		for(int i=0; i<a.length; i++) {
			if(y[i] != a[i]) {
				System.out.println(y[i]);	
			}
		}
		
	}
}
