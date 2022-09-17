package ch12;
/*
 * 날짜 : 2022/09/17
 * 이름 : 박가영
 * 내용 : P443 TreeMap 활용하기
 */

import java.util.Iterator;
import java.util.TreeMap;

public class P443 {
	private TreeMap<Integer, P436> treeMap;
	
	public P443() {
		treeMap = new TreeMap<Integer, P436>();
	}
	public void addMember(P436 member) {
		treeMap.put(member.getMemberId(), member);
	}
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			P436 member = treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
		
	}

}
