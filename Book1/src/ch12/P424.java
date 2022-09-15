package ch12;

import java.util.HashSet;
import java.util.Iterator;

/*
 * 날짜 : 2022/09/15
 * 이름 : 박가영
 * 내용 : P424 HashSet 활용하기
 */
public class P424 {
	private HashSet<P407> hashSet;
	
	public P424() {
		hashSet = new HashSet<P407>();
	}
	
	public void addMember(P407 member) {
		hashSet.add(member);
	}
	public boolean removeMember(int memberId) {
		Iterator<P407> ir = hashSet.iterator();
		
		while(ir.hasNext()) {
			P407 member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId+"가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember() {
		for(P407 member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}

}
