package ch13;
/*
 * 날짜 : 2022/09/17
 * 이름 : 박가영
 * 내용 : P556 제네릭 메소드 작성하기
 */
public class P556 {
	public static <T> void printArray(T[] array) {
		for(T element : array) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[] iArray = {10,20,30,40,50};
		Double[] dArray = {1.1,1.2,1.3,1.4,1.5};
		Character[] cArray = {'K', 'O', 'R', 'E', 'A'};
		
		printArray(iArray);
		printArray(dArray);
		printArray(cArray);
	}

}
