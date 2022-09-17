package ch12;
/*
 * 날짜 : 2022/09/17
 * 이름 : 박가영
 * 내용 : P431 TreeSet 활용하기
 */

import java.util.Iterator;
import java.util.TreeSet;

public class P431 {
	private TreeSet<P427> treeSet;
	
	public P431() {
		treeSet = new TreeSet<P427>();
	}
	public void addMember(P427 member) {
		treeSet.add(member);
	}
	public boolean removeMember(int memberId) {
		Iterator<P427> ir = treeSet.iterator();
		
		while(ir.hasNext()) {
			P427 member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		for(P427 member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
