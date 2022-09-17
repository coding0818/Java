package ch14;
/*
 * 날짜 : 2022/09/17
 * 이름 : 박가영
 * 내용 : P507 사용자 정의 예외 테스트하기
 */
public class P507 {
	private String userId;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) throws P506{
		if(userId == null) {
			throw new P506("아이디는 null일 수 없습니다");
		}else if(userId.length() < 8 || userId.length() > 20) {
			throw new P506("아이디는 8자 이상 20자 이하로 쓰세요");
		}
		
		this.userId = userId;
	}
	
	public static void main(String[] args) {
		P507 test = new P507();
		
		String userId = null;
		try {
			test.setUserId(userId);
		}catch (P506 e) {
			System.out.println(e.getMessage());
		}
		userId = "1234567";
		try {
			test.setUserId(userId);
		}catch(P506 e) {
			System.out.println(e.getMessage());
		}
	}

}
