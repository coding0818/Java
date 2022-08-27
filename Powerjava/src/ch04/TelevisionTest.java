package ch04;
/*
 * 날짜 : 2022/08/27
 * 이름 : 박가영
 * 내용 : P157 생성자 만들어 보기
 */
public class TelevisionTest {
	public static void main(String[] args) {
		P157 myTv = new P157(7, 10, true);
		myTv.print();
		
		P157 yourTv = new P157(11, 20, true);
		yourTv.print();
	}
	

}

