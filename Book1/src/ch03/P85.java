package ch03;
/*
 * 날짜 : 2022/08/18
 * 이름 : 박가영
 * 내용 : 비트 이동 연산자를 사용하여 연산하기
 */
public class P85 {
	public static void main(String[] args) {
		int num = 0B00000101;
		
		System.out.println(num << 2); //왼쪽으로 2비트 이동 00010100(20)
		System.out.println(num >> 2); //오른쪽으로 2비트 이동 00000001(1)
		System.out.println(num >>> 2); //오른쪽으로 2비트 이동 000000001(1)
		
		System.out.println(num);
		
		num = num << 2;
		System.out.println(num);
	}

}
