package ch12;
/*
 * 날짜 : 2022/09/17
 * 이름 : 박가영
 * 내용 : P441 HashMap 활용하기
 */
public class P441 {
	public static void main(String[] args) {
		P440 memberHashMap = new P440();
		
		P436 memberLee = new P436(1001, "이지원");
		P436 memberSon = new P436(1002, "손민국");
		P436 memberPark = new P436(1003, "박서훤");
		P436 memberHong = new P436(1004, "홍길동");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberHong);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}

}
