package ch12;
/*
 * 날짜 : 2022/09/14
 * 이름 : 박가영
 * 내용 : P411 ArrayList 활용하기
 */
public class P411 {
	public static void main(String[] args) {
		P410 memberArrayList = new P410();
		
		P407 memberLee = new P407(1001, "이지원");
		P407 memberSon = new P407(1002, "손민국");
		P407 memberPark = new P407(1003, "박서훤");
		P407 memberHong = new P407(1004, "홍길동");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberHong.getMemberId());
		memberArrayList.showAllMember();
	}

}
