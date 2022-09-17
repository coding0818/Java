package ch12;


import java.util.HashMap;
import java.util.Iterator;

/*
 * 날짜 : 2022/09/17
 * 이름 : 박가영
 * 내용 : P440 HashMap 활용하기
 */
public class P440 {
	private HashMap<Integer, P436> hashMap;
	
	public P440() {
		hashMap = new HashMap<Integer, P436>();
	}
	public void addMember(P436 member) {
		hashMap.put(member.getMemberId(), member);
	}
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			P436 member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}

}
