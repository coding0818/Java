package ch07;
/*
 * 날짜 : 2022/09/06
 * 이름 : 박가영
 * 내용 : P205 배열의 유효한 요소 값 출력하기
 */
public class P205 {
	public static void main(String[] args) {
		double[] data = new double[5];
		int size = 0;
		
		data[0] = 10.0; size++;
		data[1] = 20.0; size++;
		data[2] = 30.0; size++;
		
		for(int i=0; i<size; i++) {
			System.out.println(data[i]);
		}
	}

}
