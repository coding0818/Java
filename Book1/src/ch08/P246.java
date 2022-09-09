package ch08;
/*
 * 날짜 : 2022/09/09
 * 이름 : 박가영
 * 내용 : P246 명시적으로 상위 클래스 생성자 호출하기
 */
public class P246 extends P245{
	private int agentID;
	double saleRatio;
	
	public P246(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP"; 
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer(int, String) 생성자 호출"); //하위 클래스 생성할 때 콘솔 출력문
	}
	public int getAgentID(){
		return agentID;
	}

}
