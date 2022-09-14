package ch12;

import java.util.ArrayList;

/*
 * 날짜 : 2022/09/14
 * 이름 : 박가영
 * 내용 : P410 ArrayList 활용하기
 */
public class P410 {
	private ArrayList<P407> arrayList; //arraylist 선언
	
	public P410() {
		arrayList = new ArrayList<P407>();
	}
	public void addMember(P407 member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		for(int i=0; i<arrayList.size(); i++) {
			P407 member = arrayList.get(i); //get메서드로 회원을 순차적으로 가져옴
			int tempId = member.getMemberId();
			if(tempId == memberId) {        //회원 아이디가 매개변수와 일치하면
				arrayList.remove(i);        //해당 회원을 삭제
				return true;
			}
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(P407 member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}

}
