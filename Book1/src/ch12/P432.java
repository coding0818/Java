package ch12;
/*
 * 날짜 : 2022/09/17
 * 이름 : 박가영
 * 내용 : P432 TreeSet 활용하기
 */
public class P432 {
	public static void main(String[] args) {
		P431 memberTreeSet = new P431();
		
		P427 memberPark = new P427(1003, "박서훤");
		P427 memberLee = new P427(1001, "이지원");
		P427 memberSon = new P427(1002, "손민국");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.showAllMember();
		
		P427 memberHong = new P427(1003, "홍길동");
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
	}

}
