package ch07;
/*
 * 날짜 : 2022/09/06
 * 이름 : 박가영
 * 내용 : P204 배열 길이만큼 출력하기
 */
public class P204 {
	public static void main(String[] args) {
		double[] data = new double[5];
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
	}

}
