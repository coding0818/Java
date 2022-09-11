package ch08;
/*
 * 날짜 : 2022/09/11
 * 이름 : 박가영
 * 내용 : P263 고객 관리 프로그램 완성하기(2)
 */
public class P263 extends P262{
	private int agentID;
	double saleRatio;
	
	public P263(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP"; 
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint+= price*bonusRatio;
		return price -(int)(price*saleRatio);
	}
	public String showCustomerInfo() {
		return super.showCustomerInfo()+"담당 상담원 번호는 "+agentID+"입니다.";
	}
	
	public int getAgentID(){
		return agentID;
	}

}
