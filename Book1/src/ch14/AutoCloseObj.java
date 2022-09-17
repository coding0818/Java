package ch14;
/*
 * 날짜 : 2022/09/17
 * 이름 : 박가영
 * 내용 : P498 AutoCloseable 인터페이스 구현하기
 */
public class AutoCloseObj implements AutoCloseable{

	public void close() throws Exception{
		System.out.println("리소스가 close() 되었습니다");
	}
}
