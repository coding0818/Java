package step05;
/*
 * 날짜 : 2022/08/30
 * 이름 : 박가영
 * 내용 : 5단계 2번 셀프넘버 출력하는 프로그램 만들기
 */
public class _02 {
	public static void main(String[] args) {
		int[]y= new int[10000];
		
		for(int i=0;i<y.length;i++) {
			y[i]=i+1;
	    }
		
			
		for(int j=0;j<10000;j++) {
			
			if(y[j]!=self(j)) { 
			System.out.println(y[j]);
			}
		}
		
	}
	
	public static int self(int num) {
		int sum = num;
		
		while(num>0) {
			sum += num % 10;
			num/=10;
		}
		return sum;
	}

	
}
