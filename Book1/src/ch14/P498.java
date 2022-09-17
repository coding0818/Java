package ch14;
/*
 * 날짜 : 2022/09/17
 * 이름 : 박가영
 * 내용 : P498 try-with-resources문 사용하기(1)
 */
public class P498 {
	public static void main(String[] args) {
		try(AutoCloseObj obj = new AutoCloseObj()){
		}catch(Exception e) {
			System.out.println("예외 부분입니다");
		}
	}

}
