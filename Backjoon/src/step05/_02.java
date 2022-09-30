package step05;

import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 2022/08/30
 * 이름 : 박가영
 * 내용 : 5단계 2번 셀프넘버 출력하는 프로그램 만들기
 */
public class _02 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> self = new ArrayList<Integer>();
		
		for(int i=1; i<=10000; i++) {
			arr.add(i);
		}
		
		for(int num=1; num<=10000; num++) {
			self.add(num + (num/1000) + (num/100)%10 + (num/10)%10 + num % 10);
		}
		
		List<Integer> result = new ArrayList<Integer>();
		for(int i=1; i<self.size(); i++) {
			for(int j=1; j<arr.size(); j++) {
				if(!self.get(i).equals(arr.get(j))) {
					result.add(arr.get(i));
					System.out.println(result.get(i));
				}	
			}
			
		}
		
		
		
	}
	
}
