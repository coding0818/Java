package ch14;
/*
 * 날짜 : 2022/09/17
 * 이름 : 박가영
 * 내용 : P499 try-with-resources문 사용하기(2)
 */
public class P499 {
	public static void main(String[] args) {
		try(AutoCloseObj obj = new AutoCloseObj()){
			throw new Exception();
		}catch(Exception e) {
			System.out.println("예외부분입니다");
		}
	}

}
