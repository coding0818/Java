package ch12;
/*
 * 날짜 : 2022/09/17
 * 이름 : 박가영
 * 내용 : P434 Comparable 인터페이스 구현하기
 */
public class P434 implements Comparable<P434>{
	private int memberId;
	private String memberName;
	
	public P434(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName + "회원님의 아이디는 "+ memberId+ "입니다";
	}
	
	public int hashCode() {
		return memberId;
	}
	public boolean equals(Object obj) {
		if(obj instanceof P434) {
			P434 member = (P434)obj;
			if(this.memberId==member.memberId) {
				return true;
			}else return false;
		}
		return false;
	}
	
	public int compareTo(P434 member) {
		return (this.memberId - member.memberId);
	}
}
