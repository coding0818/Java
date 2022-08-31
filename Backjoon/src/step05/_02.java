package step05;
/*
 * 날짜 : 2022/08/30
 * 이름 : 박가영
 * 내용 : 5단계 2번 셀프넘버 출력하는 프로그램 만들기
 */
public class _02 {
	public static void main(String[] args) {
		int[]y= new int[10001];
		for(int j=0;j<y.length;j++) {
		    y[j]=j;	
		    if(y[j] != selfNumber(1)) {
				System.out.println(y[j]);	
			}
		}
		
		for(int i=0; i<y.length; i++) {
			
		}
	}

	public static int selfNumber(int n) {
		int s = n;
		
		for(n=1; n<=10000; n++) {
			s = n + (n/10) + (n%10);
			
		}
		
		return s;
		
	}
}
