package ch12;
/*
 * 날짜 : 2022/09/17
 * 이름 : 박가영
 * 내용 : P444 TreeMap 활용하기
 */
public class P444 {
	public static void main(String[] args) {
		
		P443 memberHashMap = new P443();
		
		P436 memberPark = new P436(1003, "박서훤");
		P436 memberLee = new P436(1001, "이지원");
		P436 memberHong = new P436(1004, "홍길동");
		P436 memberSon = new P436(1002, "손민국");
		
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberSon);
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}

}
