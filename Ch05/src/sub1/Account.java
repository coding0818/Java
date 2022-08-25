package sub1;
/*
 * 날짜 : 2022/08/25
 * 이름 : 박가영
 * 내용 : Java 클래스 실습하기
 */
public class Account {
	// 속성
	String bank;
	String id;
	String name;
	int balance;
	
	
	// 기능
	public void deposit(int money) {
		this.balance += money;
	}
	public void withdraw(int money) {
		this.balance -= money;
	}
	public void show() {
		System.out.println("_ _ _ _ _ _ _ _ _ _ _");
		System.out.println("은행명 : "+bank);
		System.out.println("계좌번호 : "+id);
		System.out.println("입금주 : "+name);
		System.out.println("현재잔액 : "+balance);
		System.out.println("은행명 : "+bank);
		System.out.println("_ _ _ _ _ _ _ _ _ _ _");
		
	}
	
}
