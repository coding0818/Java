package ch11;
/*
 * 날짜 : 2022/09/12
 * 이름 : 박가영
 * 내용 : P356 toString()메서드 재정의하기
 */
class Book3{
	int bookNumber;
	String bookTitle;
	
	Book3(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	public String toString() {
		return bookTitle +","+bookNumber;
	}
}
public class P356 {
	public static void main(String[] args) {
		Book3 book1 = new Book3(200, "개미");
		
		System.out.println(book1);
		System.out.println(book1.toString());
	}

}
