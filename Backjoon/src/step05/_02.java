package step05;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 날짜 : 2022/08/30
 * 이름 : 박가영
 * 내용 : 5단계 2번 셀프넘버 출력하는 프로그램 만들기
 */
public class _02 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> self = new ArrayList<>();
		ArrayList<Integer> fin = new ArrayList<>();
		
		for(int i=0; i<10000; i++) {
			arr.add(i+1);
			fin.add(i+1);
		}
		
		for(int num=1; num<=10000; num++) {
			self.add(num + (num/1000) + (num/100)%10 + (num/10)%10 + num % 10);
		}
		
		for(int i=0; i<self.size(); i++) {
			for(int j=0; j<arr.size(); j++) {
				if(!self.get(i).equals(arr.get(j))) {
					fin.set(j, 0);
				}	
			}
		}
		for(int i=0; i<fin.size(); i++) {
			if(fin.get(i)!=0) {
				System.out.println(fin.get(i));
			}
		}
		
		
	}
	
}
