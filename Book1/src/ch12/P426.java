package ch12;
/*
 * 날짜 : 2022/09/15
 * 이름 : 박가영
 * 내용 : HashSet 활용하기
 */
public class P426 {
	public static void main(String[] args) {
		P424 memberHashSet = new P424();
		
		P407 memberLee = new P407(1001, "이지원");
		P407 memberSon = new P407(1002, "손민국");
		P407 memberPark = new P407(1003, "박서훤");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.showAllMember();
		
		P407 memberHong = new P407(1003, "홍길동");
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();
		
	}

}
