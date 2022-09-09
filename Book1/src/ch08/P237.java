package ch08;
/*
 * 날짜 : 2022/09/09
 * 이름 : 박가영
 * 내용 : P237 VIPCustomer 클래스 구현하기
 */
public class P237 extends P238{
	private int agentID;
	double saleRatio;
	
	public P237() {
		customerGrade = "VIP";  //상위클래스에서 private변수이므로 오류발생
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	public int getAgentID(){
		return agentID;
	}

}
