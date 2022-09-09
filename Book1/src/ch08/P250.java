package ch08;
/*
 * 날짜 : 2022/09/09
 * 이름 : 박가영
 * 내용 : P250 calcPrice()메서드 재정의하기
 */
public class P250 extends P245{
	private int agentID;
	double saleRatio;
	
	public P250(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP"; 
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	public int getAgentID(){
		return agentID;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint+= price*bonusRatio;
		return price -(int)(price*saleRatio);
	}
}
